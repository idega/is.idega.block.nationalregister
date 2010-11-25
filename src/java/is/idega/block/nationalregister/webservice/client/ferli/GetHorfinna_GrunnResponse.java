/**
 * GetHorfinna_GrunnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class GetHorfinna_GrunnResponse  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getHorfinna_GrunnResult;

    public GetHorfinna_GrunnResponse() {
    }

    public GetHorfinna_GrunnResponse(
           is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getHorfinna_GrunnResult) {
           this.getHorfinna_GrunnResult = getHorfinna_GrunnResult;
    }


    /**
     * Gets the getHorfinna_GrunnResult value for this GetHorfinna_GrunnResponse.
     * 
     * @return getHorfinna_GrunnResult
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getGetHorfinna_GrunnResult() {
        return getHorfinna_GrunnResult;
    }


    /**
     * Sets the getHorfinna_GrunnResult value for this GetHorfinna_GrunnResponse.
     * 
     * @param getHorfinna_GrunnResult
     */
    public void setGetHorfinna_GrunnResult(is.idega.block.nationalregister.webservice.client.ferli.XML_Horfinna_Grunn getHorfinna_GrunnResult) {
        this.getHorfinna_GrunnResult = getHorfinna_GrunnResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHorfinna_GrunnResponse)) return false;
        GetHorfinna_GrunnResponse other = (GetHorfinna_GrunnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHorfinna_GrunnResult==null && other.getGetHorfinna_GrunnResult()==null) || 
             (this.getHorfinna_GrunnResult!=null &&
              this.getHorfinna_GrunnResult.equals(other.getGetHorfinna_GrunnResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetHorfinna_GrunnResult() != null) {
            _hashCode += getGetHorfinna_GrunnResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHorfinna_GrunnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">GetHorfinna_GrunnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHorfinna_GrunnResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetHorfinna_GrunnResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Horfinna_Grunn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
