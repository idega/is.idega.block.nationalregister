/**
 * TjodarsynXMLLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class TjodarsynXMLLocator extends org.apache.axis.client.Service implements is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXML {

    public TjodarsynXMLLocator() {
    }


    public TjodarsynXMLLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TjodarsynXMLLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TjodarsynXMLSoap12
    private java.lang.String TjodarsynXMLSoap12_address = "http://xml.ferli.is/tjodarsyn/service.asmx";

    public java.lang.String getTjodarsynXMLSoap12Address() {
        return TjodarsynXMLSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TjodarsynXMLSoap12WSDDServiceName = "TjodarsynXMLSoap12";

    public java.lang.String getTjodarsynXMLSoap12WSDDServiceName() {
        return TjodarsynXMLSoap12WSDDServiceName;
    }

    public void setTjodarsynXMLSoap12WSDDServiceName(java.lang.String name) {
        TjodarsynXMLSoap12WSDDServiceName = name;
    }

    public is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType getTjodarsynXMLSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TjodarsynXMLSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTjodarsynXMLSoap12(endpoint);
    }

    public is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType getTjodarsynXMLSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap12Stub _stub = new is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap12Stub(portAddress, this);
            _stub.setPortName(getTjodarsynXMLSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTjodarsynXMLSoap12EndpointAddress(java.lang.String address) {
        TjodarsynXMLSoap12_address = address;
    }


    // Use to get a proxy class for TjodarsynXMLSoap
    private java.lang.String TjodarsynXMLSoap_address = "http://xml.ferli.is/tjodarsyn/service.asmx";

    public java.lang.String getTjodarsynXMLSoapAddress() {
        return TjodarsynXMLSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TjodarsynXMLSoapWSDDServiceName = "TjodarsynXMLSoap";

    public java.lang.String getTjodarsynXMLSoapWSDDServiceName() {
        return TjodarsynXMLSoapWSDDServiceName;
    }

    public void setTjodarsynXMLSoapWSDDServiceName(java.lang.String name) {
        TjodarsynXMLSoapWSDDServiceName = name;
    }

    public is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType getTjodarsynXMLSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TjodarsynXMLSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTjodarsynXMLSoap(endpoint);
    }

    public is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType getTjodarsynXMLSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_BindingStub _stub = new is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_BindingStub(portAddress, this);
            _stub.setPortName(getTjodarsynXMLSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTjodarsynXMLSoapEndpointAddress(java.lang.String address) {
        TjodarsynXMLSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap12Stub _stub = new is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap12Stub(new java.net.URL(TjodarsynXMLSoap12_address), this);
                _stub.setPortName(getTjodarsynXMLSoap12WSDDServiceName());
                return _stub;
            }
            if (is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_BindingStub _stub = new is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_BindingStub(new java.net.URL(TjodarsynXMLSoap_address), this);
                _stub.setPortName(getTjodarsynXMLSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TjodarsynXMLSoap12".equals(inputPortName)) {
            return getTjodarsynXMLSoap12();
        }
        else if ("TjodarsynXMLSoap".equals(inputPortName)) {
            return getTjodarsynXMLSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.ferli.is", "TjodarsynXML");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.ferli.is", "TjodarsynXMLSoap12"));
            ports.add(new javax.xml.namespace.QName("http://xml.ferli.is", "TjodarsynXMLSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TjodarsynXMLSoap12".equals(portName)) {
            setTjodarsynXMLSoap12EndpointAddress(address);
        }
        else 
if ("TjodarsynXMLSoap".equals(portName)) {
            setTjodarsynXMLSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
