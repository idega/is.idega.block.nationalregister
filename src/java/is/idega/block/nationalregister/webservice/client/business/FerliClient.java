package is.idega.block.nationalregister.webservice.client.business;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.logging.Logger;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;

import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLLocator;
import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType;
import is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn;

@Service(FerliClient.BEAN_NAME)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FerliClient {

	public static final String BEAN_NAME = "ferliClient";

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
			TjodarsynXMLSoap_PortType port = getPort();
			if(port != null){
				XML_Nafn_Grunn entry = port.getNafn_Grunn(personalID, login.password);

				if ("0".equals(entry.getRetkod())) {

					return createUserHolderFromNafnGrunn(entry);
				} else {
					System.out.println(entry.getRetLys());
				}
			} else {
				Logger.getLogger(FerliClient.class.getName()).warning("TjodarsynXMLSoap_PortType is null.");
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