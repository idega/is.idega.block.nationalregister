/**
 * GetUtangards_GrunnResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class GetUtangards_GrunnResponse  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getUtangards_GrunnResult;

    public GetUtangards_GrunnResponse() {
    }

    public GetUtangards_GrunnResponse(
           is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getUtangards_GrunnResult) {
           this.getUtangards_GrunnResult = getUtangards_GrunnResult;
    }


    /**
     * Gets the getUtangards_GrunnResult value for this GetUtangards_GrunnResponse.
     * 
     * @return getUtangards_GrunnResult
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getGetUtangards_GrunnResult() {
        return getUtangards_GrunnResult;
    }


    /**
     * Sets the getUtangards_GrunnResult value for this GetUtangards_GrunnResponse.
     * 
     * @param getUtangards_GrunnResult
     */
    public void setGetUtangards_GrunnResult(is.idega.block.nationalregister.webservice.client.ferli.XML_Utangards_Grunn getUtangards_GrunnResult) {
        this.getUtangards_GrunnResult = getUtangards_GrunnResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUtangards_GrunnResponse)) return false;
        GetUtangards_GrunnResponse other = (GetUtangards_GrunnResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUtangards_GrunnResult==null && other.getGetUtangards_GrunnResult()==null) || 
             (this.getUtangards_GrunnResult!=null &&
              this.getUtangards_GrunnResult.equals(other.getGetUtangards_GrunnResult())));
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
        if (getGetUtangards_GrunnResult() != null) {
            _hashCode += getGetUtangards_GrunnResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUtangards_GrunnResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">GetUtangards_GrunnResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUtangards_GrunnResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "GetUtangards_GrunnResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Utangards_Grunn"));
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
