/**
 * XMF0003Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMF0003Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0003Result;

    public XMF0003Response() {
    }

    public XMF0003Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0003Result) {
           this.XMF0003Result = XMF0003Result;
    }


    /**
     * Gets the XMF0003Result value for this XMF0003Response.
     * 
     * @return XMF0003Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMF0003Result() {
        return XMF0003Result;
    }


    /**
     * Sets the XMF0003Result value for this XMF0003Response.
     * 
     * @param XMF0003Result
     */
    public void setXMF0003Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0003Result) {
        this.XMF0003Result = XMF0003Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMF0003Response)) return false;
        XMF0003Response other = (XMF0003Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMF0003Result==null && other.getXMF0003Result()==null) || 
             (this.XMF0003Result!=null &&
              this.XMF0003Result.equals(other.getXMF0003Result())));
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
        if (getXMF0003Result() != null) {
            _hashCode += getXMF0003Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMF0003Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMF0003Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMF0003Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMF0003Result"));
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
