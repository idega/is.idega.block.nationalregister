/**
 * XMF0004Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMF0004Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0004Result;

    public XMF0004Response() {
    }

    public XMF0004Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0004Result) {
           this.XMF0004Result = XMF0004Result;
    }


    /**
     * Gets the XMF0004Result value for this XMF0004Response.
     * 
     * @return XMF0004Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMF0004Result() {
        return XMF0004Result;
    }


    /**
     * Sets the XMF0004Result value for this XMF0004Response.
     * 
     * @param XMF0004Result
     */
    public void setXMF0004Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0004Result) {
        this.XMF0004Result = XMF0004Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMF0004Response)) return false;
        XMF0004Response other = (XMF0004Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMF0004Result==null && other.getXMF0004Result()==null) || 
             (this.XMF0004Result!=null &&
              this.XMF0004Result.equals(other.getXMF0004Result())));
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
        if (getXMF0004Result() != null) {
            _hashCode += getXMF0004Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMF0004Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMF0004Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMF0004Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMF0004Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Uttak"));
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
