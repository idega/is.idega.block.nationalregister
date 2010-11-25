package is.idega.block.nationalregister.webservice.client.business;

import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLLocator;
import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType;
import is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;

@Scope("singleton")
@Service("ferliClient")
public class FerliClient {
	private static final String DEFAULT_ENDPOINT = "http://xml.ferli.is/tjodarsyn/service.asmx";
	private static final String ENDPOINT_ATTRIBUTE_NAME = "ferli_natreg_endpoint";

	private static final String PASSWORD = "ferli_natreg_password";

	private TjodarsynXMLSoap_PortType getPort() {
		String endPoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(ENDPOINT_ATTRIBUTE_NAME, DEFAULT_ENDPOINT);

		try {
			TjodarsynXMLLocator locator = new TjodarsynXMLLocator();
			TjodarsynXMLSoap_PortType port;
			port = locator.getTjodarsynXMLSoap(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return null;
	}

	public UserHolder getUser(String personalID) {
		FerliLoginClass login = getLogin();

		try {
			XML_Nafn_Grunn entry = getPort().getNafn_Grunn(personalID, login.password);
			
			if ("0".equals(entry.getRetkod())) {
				
				return createUserHolderFromNafnGrunn(entry);
			} else {
				System.out.println(entry.getRetLys());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	private UserHolder createUserHolderFromNafnGrunn(XML_Nafn_Grunn entry) {
		return new UserHolder(entry.getNafn(), entry.getKennitala(),
				entry.getHeimili(), entry.getPostnr(), entry.getPostfang());
	}

	private class FerliLoginClass {
		protected String password = null;

		public FerliLoginClass() {
			super();
			IWMainApplicationSettings settings = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings();
			password = settings.getProperty(PASSWORD, "");
		}
	}

	private FerliLoginClass getLogin() {
		return new FerliLoginClass();
	}
}