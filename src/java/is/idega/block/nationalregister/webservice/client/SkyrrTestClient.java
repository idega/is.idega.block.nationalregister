package is.idega.block.nationalregister.webservice.client;

import is.idega.block.nationalregister.webservice.client.skyrr.Faersla;
import is.idega.block.nationalregister.webservice.client.skyrr.Uttak;
import is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceLocator;
import is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class SkyrrTestClient {

	public static void main(String[] args) {
		
		try {
			String endpoint = "https://gognxml.uh.is/xml_service.asmx";
			
			Xml_ServiceLocator locator = new Xml_ServiceLocator();
			Xml_ServiceSoap_PortType port = locator.getxml_ServiceSoap(new URL(endpoint));
			
			//Uttak utak = port.XMT0002(p_sUppruni, p_sKtGreid, p_sKtNot, p_sPassword, m_sKennitala)
/*			Uttak res = port.XMT0002(args[0], args[1], args[2], args[3], args[4]);
			
			if (res.isFANNST()) {
				System.out.println("Number of entries = " + res.getFJOLDINIDURSTADA());
				Object ret[] = res.getNIDURSTADA();
				System.out.println("ret.size = " + ret.length);
				for (int i = 0; i < ret.length; i++) {
					Faersla entry = (Faersla) ret[i];
					System.out.println("name = " + entry.getNAFN());
					System.out.println("heimili = " + entry.getHEIMILI());
					System.out.println("postnumer = " + entry.getPOSTNUMER());
					System.out.println("poststod = " + entry.getPOSTSTOD());
					System.out.println("kennitala = " + entry.getKENNITALA());
					//System.out.println("kynkodi = " +entry.getKYNKODI());
				}
			} else {
				System.out.println("Didn't find user " + res.getVILLA());
			}
			
	*/		
			Uttak res = port.XMF0002(args[0], args[1], args[2], args[3], args[4]);
			
			if (res.isFANNST()) {
				Object ret[] = res.getNIDURSTADA();
				for (int i = 0; i < ret.length; i++) {
					Faersla entry = (Faersla) ret[i];
					System.out.println("name = " + entry.getNAFN());
					System.out.println("postnumer = " + entry.getPOSTNUMER());
					System.out.println("poststod = " + entry.getPOSTSTOD());
					System.out.println("kennitala = " + entry.getKENNITALA());

					System.out.println("atvinnugr.nr. = " + entry.getATVINNUGREINANUMER());
					System.out.println("is atv.gr.nr. = " + entry.getISATVINNUGREINANUMER());
					System.out.println("postaritun = " + entry.getPOSTARITUN());
					System.out.println("rekstrarform = " + entry.getREKSTRARFORM());
					System.out.println("vasknumer = " + entry.getVASKNUMER());
				}
			} else {
				System.out.println("Didn't find user " + res.getVILLA());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}