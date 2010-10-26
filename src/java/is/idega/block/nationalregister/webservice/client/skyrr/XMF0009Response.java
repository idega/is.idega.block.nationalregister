/**
 * XMF0009Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMF0009Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0009Result;

    public XMF0009Response() {
    }

    public XMF0009Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0009Result) {
           this.XMF0009Result = XMF0009Result;
    }


    /**
     * Gets the XMF0009Result value for this XMF0009Response.
     * 
     * @return XMF0009Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMF0009Result() {
        return XMF0009Result;
    }


    /**
     * Sets the XMF0009Result value for this XMF0009Response.
     * 
     * @param XMF0009Result
     */
    public void setXMF0009Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0009Result) {
        this.XMF0009Result = XMF0009Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMF0009Response)) return false;
        XMF0009Response other = (XMF0009Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMF0009Result==null && other.getXMF0009Result()==null) || 
             (this.XMF0009Result!=null &&
              this.XMF0009Result.equals(other.getXMF0009Result())));
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
        if (getXMF0009Result() != null) {
            _hashCode += getXMF0009Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMF0009Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMF0009Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMF0009Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMF0009Result"));
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
