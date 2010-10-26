/**
 * Xml_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Xml_ServiceLocator extends org.apache.axis.client.Service implements is.idega.block.nationalregister.webservice.client.skyrr.Xml_Service {

    public Xml_ServiceLocator() {
    }


    public Xml_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Xml_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for xml_ServiceSoap12
    private java.lang.String xml_ServiceSoap12_address = "https://gognxml.uh.is/xml_service.asmx";

    public java.lang.String getxml_ServiceSoap12Address() {
        return xml_ServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String xml_ServiceSoap12WSDDServiceName = "xml_ServiceSoap12";

    public java.lang.String getxml_ServiceSoap12WSDDServiceName() {
        return xml_ServiceSoap12WSDDServiceName;
    }

    public void setxml_ServiceSoap12WSDDServiceName(java.lang.String name) {
        xml_ServiceSoap12WSDDServiceName = name;
    }

    public is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType getxml_ServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(xml_ServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getxml_ServiceSoap12(endpoint);
    }

    public is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType getxml_ServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap12Stub _stub = new is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getxml_ServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setxml_ServiceSoap12EndpointAddress(java.lang.String address) {
        xml_ServiceSoap12_address = address;
    }


    // Use to get a proxy class for xml_ServiceSoap
    private java.lang.String xml_ServiceSoap_address = "https://gognxml.uh.is/xml_service.asmx";

    public java.lang.String getxml_ServiceSoapAddress() {
        return xml_ServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String xml_ServiceSoapWSDDServiceName = "xml_ServiceSoap";

    public java.lang.String getxml_ServiceSoapWSDDServiceName() {
        return xml_ServiceSoapWSDDServiceName;
    }

    public void setxml_ServiceSoapWSDDServiceName(java.lang.String name) {
        xml_ServiceSoapWSDDServiceName = name;
    }

    public is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType getxml_ServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(xml_ServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getxml_ServiceSoap(endpoint);
    }

    public is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType getxml_ServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_BindingStub _stub = new is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getxml_ServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setxml_ServiceSoapEndpointAddress(java.lang.String address) {
        xml_ServiceSoap_address = address;
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
            if (is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap12Stub _stub = new is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap12Stub(new java.net.URL(xml_ServiceSoap12_address), this);
                _stub.setPortName(getxml_ServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_BindingStub _stub = new is.idega.block.nationalregister.webservice.client.skyrr.Xml_ServiceSoap_BindingStub(new java.net.URL(xml_ServiceSoap_address), this);
                _stub.setPortName(getxml_ServiceSoapWSDDServiceName());
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
        if ("xml_ServiceSoap12".equals(inputPortName)) {
            return getxml_ServiceSoap12();
        }
        else if ("xml_ServiceSoap".equals(inputPortName)) {
            return getxml_ServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "xml_Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "xml_ServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "xml_ServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("xml_ServiceSoap12".equals(portName)) {
            setxml_ServiceSoap12EndpointAddress(address);
        }
        else 
if ("xml_ServiceSoap".equals(portName)) {
            setxml_ServiceSoapEndpointAddress(address);
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
