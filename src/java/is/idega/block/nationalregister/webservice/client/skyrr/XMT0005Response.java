/**
 * XMT0005Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMT0005Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0005Result;

    public XMT0005Response() {
    }

    public XMT0005Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0005Result) {
           this.XMT0005Result = XMT0005Result;
    }


    /**
     * Gets the XMT0005Result value for this XMT0005Response.
     * 
     * @return XMT0005Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMT0005Result() {
        return XMT0005Result;
    }


    /**
     * Sets the XMT0005Result value for this XMT0005Response.
     * 
     * @param XMT0005Result
     */
    public void setXMT0005Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0005Result) {
        this.XMT0005Result = XMT0005Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMT0005Response)) return false;
        XMT0005Response other = (XMT0005Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMT0005Result==null && other.getXMT0005Result()==null) || 
             (this.XMT0005Result!=null &&
              this.XMT0005Result.equals(other.getXMT0005Result())));
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
        if (getXMT0005Result() != null) {
            _hashCode += getXMT0005Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMT0005Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMT0005Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMT0005Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMT0005Result"));
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
