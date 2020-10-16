package is.idega.block.nationalregister.webservice.client.business;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.StringUtil;

import is.idega.block.nationalregister.webservice.client.skyrr.Faersla;
import is.idega.block.nationalregister.webservice.client.skyrr.Uttak;
import is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceLocator;
import is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType;

@Service("skyrrClient")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SkyrrClient extends DefaultSpringBean {

	private static final String DEFAULT_ENDPOINT = "https://gognxml.uh.is/xml_service.asmx";
	private static final String ENDPOINT_ATTRIBUTE_NAME = "skyrr_natreg_endpoint";

	private static final String ORIGIN = "skyrr_natreg_origin";
	private static final String PAYER = "skyrr_natreg_payer";
	private static final String USERNAME = "skyrr_natreg_username";
	private static final String PASSWORD = "skyrr_natreg_password";

	private Xml_ServiceSoap_PortType getPort() {
		String endPoint = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(ENDPOINT_ATTRIBUTE_NAME, DEFAULT_ENDPOINT);

		try {
			Xml_ServiceLocator locator = new Xml_ServiceLocator();
			Xml_ServiceSoap_PortType port;
			port = locator.getxml_ServiceSoap(new URL(endPoint));

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
		SkyrrLoginClass login = getLogin();

		try {
			Uttak res = getPort().XMT0002(login.origin, login.payersPersonalID,
					login.username, login.password, personalID);
			if (res.isFANNST()) {
				Object ret[] = res.getNIDURSTADA();
				Faersla entry = (Faersla) ret[0];

				return createUserHolderFromFaersla(entry);
			} else {
				getLogger().warning("Personal ID: " + personalID + ": " + res.getVILLA());
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting user by personal ID " + personalID + ". Login: " + login, e);
		}

		return null;
	}

	public CompanyHolder getCompany(String personalID) {
		SkyrrLoginClass login = getLogin();

		try {
			if (login == null || StringUtil.isEmpty(login.username) || StringUtil.isEmpty(login.password)) {
				return null;
			}

			Uttak res = getPort().XMF0009(login.origin, login.payersPersonalID,
					login.username, login.password, personalID);
			if (res.isFANNST()) {
				Object ret[] = res.getNIDURSTADA();
				Faersla entry = (Faersla) ret[0];

				return createCompanyHolderFromFaersla(entry);
			} else {
				getLogger().warning("Personal ID: " + personalID + ": " + res.getVILLA());
			}
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting company by personal ID " + personalID + ". Login: " + login, e);
		}

		return null;
	}

	private UserHolder createUserHolderFromFaersla(Faersla entry) {
		return new UserHolder(entry.getNAFN(), entry.getKENNITALA(),
				entry.getHEIMILI(), entry.getPOSTNUMER(), entry.getPOSTSTOD());
	}

	private CompanyHolder createCompanyHolderFromFaersla(Faersla entry) {
		return new CompanyHolder(entry.getNAFN(), entry.getKENNITALA(),
				entry.getLOGHEIMILI(), entry.getPOSTNUMER_LOGHEIMILIS(),
				entry.getPOSTSTOD_LOGHEIMILIS(), entry.getATVINNUGREINANUMER(),
				entry.getISATVINNUGREINANUMER(), entry.getREKSTRARFORM(),
				entry.getVASKNUMER());

	}

	private class SkyrrLoginClass {

		protected String origin = null;
		protected String payersPersonalID = null;
		protected String username = null;
		protected String password = null;

		public SkyrrLoginClass() {
			super();

			IWMainApplicationSettings settings = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings();
			origin = settings.getProperty(ORIGIN, "");
			payersPersonalID = settings.getProperty(PAYER, "");
			username = settings.getProperty(USERNAME, "");
			password = settings.getProperty(PASSWORD, "");
		}

		@Override
		public String toString() {
			return "Origin: " + origin + ", payersPersonalID: " + payersPersonalID + ", username: " + username + ", password: " + password;
		}

	}

	private SkyrrLoginClass getLogin() {
		return new SkyrrLoginClass();
	}

}