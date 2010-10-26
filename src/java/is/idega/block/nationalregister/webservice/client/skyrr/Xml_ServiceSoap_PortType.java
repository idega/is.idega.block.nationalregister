/**
 * Xml_ServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public interface Xml_ServiceSoap_PortType extends java.rmi.Remote {

    /**
     * Til að testa virkni
     */
    public java.lang.String helloWorld() throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn og kennitölu, heimilisfangs upplýsingar
     * og bannmerkingu einstaklings
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0002(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn og kennitölu einstaklinga eftir
     * nafni eða hluta úr nafni
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0003(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sNafn) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um fyrirtæki eftir kennitölu
     * óháð afmörkum
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0002(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn og kennitölu fyrirtækja eftir nafni
     * eða hluta úr nafni
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0003(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sNafn) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn, kennitölu og heimilisfang fyrirtækja
     * eftir nafni eða hluta úr nafni
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0004(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sNafn) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um stórfyrirtæki eftir kennitölu
     * - nákvæmari færslur
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0009(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um ökutæki
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0002(java.lang.String sUppruni, java.lang.String sKT_Greidanda, java.lang.String sKT_Notanda, java.lang.String p_sPassword, java.lang.String sFastnr, java.lang.String sSkranNumer) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um ökutæki - nákvæmari upplýsingar
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0003(java.lang.String sUppruni, java.lang.String sKT_Greidanda, java.lang.String sKT_Notanda, java.lang.String p_sPassword, java.lang.String sFastnr, java.lang.String sSkranNumer) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um ökutæki - allar upplýsingar
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0004(java.lang.String sUppruni, java.lang.String sKT_Greidanda, java.lang.String sKT_Notanda, java.lang.String p_sPassword, java.lang.String sFastnr, java.lang.String sSkranNumer) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir ítarlegar upplýsingar um einstakling
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0005(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Fjölskylduupplýsingar sóttar eftir kennitölu
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0006(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn og kennitölu, heimilisfangs upplýsingar
     * og bannmerkingu á utangarðsskrá
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMU0003(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir nafn og kennitölu, heimilisfangs upplýsingar
     * og bannmerkingu á utangarðsskrá
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMU0013(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala) throws java.rmi.RemoteException;

    /**
     * Vefþjónusta sem sækir upplýsingar um einstakling fyrir STORK
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMTSTOR(java.lang.String p_sUppruni, java.lang.String p_sKtGreid, java.lang.String p_sKtNot, java.lang.String p_sPassword, java.lang.String m_sKennitala, int m_iNafn, int m_iKyn, int m_iRikisfang, int m_iHjuskaparstada, int m_iFaedingardagur, int m_iHeimilisfang) throws java.rmi.RemoteException;
}
