/**
 * XMO0004Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMO0004Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0004Result;

    public XMO0004Response() {
    }

    public XMO0004Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0004Result) {
           this.XMO0004Result = XMO0004Result;
    }


    /**
     * Gets the XMO0004Result value for this XMO0004Response.
     * 
     * @return XMO0004Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMO0004Result() {
        return XMO0004Result;
    }


    /**
     * Sets the XMO0004Result value for this XMO0004Response.
     * 
     * @param XMO0004Result
     */
    public void setXMO0004Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMO0004Result) {
        this.XMO0004Result = XMO0004Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMO0004Response)) return false;
        XMO0004Response other = (XMO0004Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMO0004Result==null && other.getXMO0004Result()==null) || 
             (this.XMO0004Result!=null &&
              this.XMO0004Result.equals(other.getXMO0004Result())));
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
        if (getXMO0004Result() != null) {
            _hashCode += getXMO0004Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMO0004Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMO0004Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMO0004Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMO0004Result"));
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
