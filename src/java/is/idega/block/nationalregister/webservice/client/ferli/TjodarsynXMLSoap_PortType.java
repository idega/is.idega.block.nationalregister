/**
 * TjodarsynXMLSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public interface TjodarsynXMLSoap_PortType extends java.rmi.Remote {

    /**
     * Sýnir IP-töluna sem þú kemur frá.
     */
    public java.lang.String helloWorld() throws java.rmi.RemoteException;

    /**
     * Gefur grunn nafnafærslu, þarf kennitölu og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn getNafn_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Gefur nánari upplýsingar um nafnafærslu, þarf kennitölu og
     * lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar getNafn_Nanar(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Gefur nafnalista - finnur 30 næstu nöfn í þjóðskránni, þarf
     * leitarnafn, kennitölu, leitarátt (A=Áfram, B=Bakka) og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi getNafnaListi(java.lang.String str_Nafn, java.lang.String str_KTala, java.lang.String str_Lesa, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Gefur grunnfærslu úr Utangarðsskrá, þarf kennitölu og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getUtangards_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Gefur grunnfærslu úr Horfinna-skrá, þarf kennitölu og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getHorfinna_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Sækir nöfn og heimili allra í sömu fjölskyldunni (sama fjölskyldunúmer),
     * þarf kennitölu og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getFjolskyldu(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;

    /**
     * Gefur grunnfærslu úr fyrirtækjaskrá, þarf kennitölu og lykilorð
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn getFyrirtaeki_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException;
}
