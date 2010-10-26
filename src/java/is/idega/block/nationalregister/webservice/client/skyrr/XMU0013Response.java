/**
 * XMU0013Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMU0013Response  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMU0013Result;

    public XMU0013Response() {
    }

    public XMU0013Response(
           is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMU0013Result) {
           this.XMU0013Result = XMU0013Result;
    }


    /**
     * Gets the XMU0013Result value for this XMU0013Response.
     * 
     * @return XMU0013Result
     */
    public is.idega.block.nationalregister.webservice.client.skyrr.Uttak getXMU0013Result() {
        return XMU0013Result;
    }


    /**
     * Sets the XMU0013Result value for this XMU0013Response.
     * 
     * @param XMU0013Result
     */
    public void setXMU0013Result(is.idega.block.nationalregister.webservice.client.skyrr.Uttak XMU0013Result) {
        this.XMU0013Result = XMU0013Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMU0013Response)) return false;
        XMU0013Response other = (XMU0013Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XMU0013Result==null && other.getXMU0013Result()==null) || 
             (this.XMU0013Result!=null &&
              this.XMU0013Result.equals(other.getXMU0013Result())));
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
        if (getXMU0013Result() != null) {
            _hashCode += getXMU0013Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMU0013Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMU0013Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMU0013Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XMU0013Result"));
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
