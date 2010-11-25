/**
 * GetFjolskylduResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class GetFjolskylduResponse  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getFjolskylduResult;

    public GetFjolskylduResponse() {
    }

    public GetFjolskylduResponse(
           is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getFjolskylduResult) {
           this.getFjolskylduResult = getFjolskylduResult;
    }


    /**
     * Gets the getFjolskylduResult value for this GetFjolskylduResponse.
     * 
     * @return getFjolskylduResult
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getGetFjolskylduResult() {
        return getFjolskylduResult;
    }


    /**
     * Sets the getFjolskylduResult value for this GetFjolskylduResponse.
     * 
     * @param getFjolskylduResult
     */
    public void setGetFjolskylduResult(is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSK getFjolskylduResult) {
        this.getFjolskylduResult = getFjolskylduResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFjolskylduResponse)) return false;
        GetFjolskylduResponse other = (GetFjolskylduResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFjolskylduResult==null && other.getGetFjolskylduResult()==null) || 
             (this.getFjolskylduResult!=null &&
              this.getFjolskylduResult.equals(other.getGetFjolskylduResult())));
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
        if (getGetFjolskylduResult() != null) {
            _hashCode += getGetFjolskylduResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFjolskylduResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFjolskylduResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFjolskylduResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetFjolskylduResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FJOLSK"));
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
