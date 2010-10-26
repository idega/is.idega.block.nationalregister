/**
 * XMT0002Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMT0002Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0002Result;

    public XMT0002Response() {
    }

    public XMT0002Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0002Result) {
           this.XMT0002Result = XMT0002Result;
    }


    /**
     * Gets the XMT0002Result value for this XMT0002Response.
     * 
     * @return XMT0002Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMT0002Result() {
        return XMT0002Result;
    }


    /**
     * Sets the XMT0002Result value for this XMT0002Response.
     * 
     * @param XMT0002Result
     */
    public void setXMT0002Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMT0002Result) {
        this.XMT0002Result = XMT0002Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMT0002Response)) return false;
        XMT0002Response other = (XMT0002Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMT0002Result==null && other.getXMT0002Result()==null) || 
             (this.XMT0002Result!=null &&
              this.XMT0002Result.equals(other.getXMT0002Result())));
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
        if (getXMT0002Result() != null) {
            _hashCode += getXMT0002Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMT0002Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMT0002Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMT0002Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMT0002Result"));
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
