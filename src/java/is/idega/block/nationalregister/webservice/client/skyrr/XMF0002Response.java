/**
 * XMF0002Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMF0002Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0002Result;

    public XMF0002Response() {
    }

    public XMF0002Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0002Result) {
           this.XMF0002Result = XMF0002Result;
    }


    /**
     * Gets the XMF0002Result value for this XMF0002Response.
     * 
     * @return XMF0002Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMF0002Result() {
        return XMF0002Result;
    }


    /**
     * Sets the XMF0002Result value for this XMF0002Response.
     * 
     * @param XMF0002Result
     */
    public void setXMF0002Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMF0002Result) {
        this.XMF0002Result = XMF0002Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMF0002Response)) return false;
        XMF0002Response other = (XMF0002Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMF0002Result==null && other.getXMF0002Result()==null) || 
             (this.XMF0002Result!=null &&
              this.XMF0002Result.equals(other.getXMF0002Result())));
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
        if (getXMF0002Result() != null) {
            _hashCode += getXMF0002Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMF0002Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMF0002Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMF0002Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMF0002Result"));
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
