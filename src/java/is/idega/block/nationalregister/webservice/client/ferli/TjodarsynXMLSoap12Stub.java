/**
 * TjodarsynXMLSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class TjodarsynXMLSoap12Stub extends org.apache.axis.client.Stub implements is.idega.block.nationalregister.webservice.client.ferli.TjodarsynXMLSoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HelloWorld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "HelloWorldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNafn_Grunn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Grunn"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafn_GrunnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNafn_Nanar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Nanar"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafn_NanarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNafnaListi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Nafn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_KTala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Lesa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Listi"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafnaListiResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUtangards_Grunn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Utangards_Grunn"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetUtangards_GrunnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHorfinna_Grunn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Horfinna_Grunn"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetHorfinna_GrunnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFjolskyldu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FJOLSK"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetFjolskylduResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFyrirtaeki_Grunn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FYRIRT_Grunn"));
        oper.setReturnClass(is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetFyrirtaeki_GrunnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public TjodarsynXMLSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TjodarsynXMLSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TjodarsynXMLSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFjolskyldu");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetFjolskyldu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFjolskylduResponse");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetFjolskylduResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFyrirtaeki_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetFyrirtaeki_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFyrirtaeki_GrunnResponse");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetFyrirtaeki_GrunnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetHorfinna_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetHorfinna_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetHorfinna_GrunnResponse");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetHorfinna_GrunnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetUtangards_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetUtangards_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">GetUtangards_GrunnResponse");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.GetUtangards_GrunnResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">XML_FJOLSK>Fjolskylda");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSKFjolskylda.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", ">XML_Nafn_Listi>Nafnalisti");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_ListiNafnalisti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FJOLSK");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FYRIRT_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Horfinna_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Listi");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Nanar");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Utangards_Grunn");
            cachedSerQNames.add(qName);
            cls = is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String helloWorld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/HelloWorld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "HelloWorld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn getNafn_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetNafn_Grunn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafn_Grunn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Grunn.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar getNafn_Nanar(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetNafn_Nanar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafn_Nanar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Nanar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi getNafnaListi(java.lang.String str_Nafn, java.lang.String str_KTala, java.lang.String str_Lesa, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetNafnaListi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetNafnaListi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Nafn, str_KTala, str_Lesa, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_Listi.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getUtangards_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetUtangards_Grunn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetUtangards_Grunn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getHorfinna_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetHorfinna_Grunn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetHorfinna_Grunn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getFjolskyldu(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetFjolskyldu");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetFjolskyldu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn getFyrirtaeki_Grunn(java.lang.String str_Ktala, java.lang.String str_PassWord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xml.ferli.is/GetFyrirtaeki_Grunn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetFyrirtaeki_Grunn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {str_Ktala, str_PassWord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn) org.apache.axis.utils.JavaUtils.convert(_resp, is.idega.block.nationalregister.webservice.client.ferli.XML_FYRIRT_Grunn.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
