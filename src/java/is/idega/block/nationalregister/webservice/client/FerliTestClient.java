package is.idega.block.nationalregister.webservice.client;

import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLLocator;
import is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType;
import is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class FerliTestClient {

	public static void main(String[] args) {
		
		try {
			String endpoint = "http://xml.ferli.is/tjodarsyn/service.asmx";
			
			TjodarsynXMLLocator locator = new TjodarsynXMLLocator();
			TjodarsynXMLSoap_PortType port = locator.getTjodarsynXMLSoap(new URL(endpoint));
			
			XML_Nafn_Grunn entry = port.getNafn_Grunn(args[0], args[1]);

			System.out.println("name = " + entry.getNafn());
			System.out.println("heimili = " + entry.getHeimili());
			System.out.println("postnumer = " + entry.getPostnr());
			System.out.println("poststod = " + entry.getPostfang());
			System.out.println("kennitala = " + entry.getKennitala());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}