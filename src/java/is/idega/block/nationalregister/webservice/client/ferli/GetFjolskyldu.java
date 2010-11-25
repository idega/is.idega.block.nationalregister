/**
 * GetFjolskyldu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class GetFjolskyldu  implements java.io.Serializable {
    private java.lang.String str_Ktala;

    private java.lang.String str_PassWord;

    public GetFjolskyldu() {
    }

    public GetFjolskyldu(
           java.lang.String str_Ktala,
           java.lang.String str_PassWord) {
           this.str_Ktala = str_Ktala;
           this.str_PassWord = str_PassWord;
    }


    /**
     * Gets the str_Ktala value for this GetFjolskyldu.
     * 
     * @return str_Ktala
     */
    public java.lang.String getStr_Ktala() {
        return str_Ktala;
    }


    /**
     * Sets the str_Ktala value for this GetFjolskyldu.
     * 
     * @param str_Ktala
     */
    public void setStr_Ktala(java.lang.String str_Ktala) {
        this.str_Ktala = str_Ktala;
    }


    /**
     * Gets the str_PassWord value for this GetFjolskyldu.
     * 
     * @return str_PassWord
     */
    public java.lang.String getStr_PassWord() {
        return str_PassWord;
    }


    /**
     * Sets the str_PassWord value for this GetFjolskyldu.
     * 
     * @param str_PassWord
     */
    public void setStr_PassWord(java.lang.String str_PassWord) {
        this.str_PassWord = str_PassWord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFjolskyldu)) return false;
        GetFjolskyldu other = (GetFjolskyldu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.str_Ktala==null && other.getStr_Ktala()==null) || 
             (this.str_Ktala!=null &&
              this.str_Ktala.equals(other.getStr_Ktala()))) &&
            ((this.str_PassWord==null && other.getStr_PassWord()==null) || 
             (this.str_PassWord!=null &&
              this.str_PassWord.equals(other.getStr_PassWord())));
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
        if (getStr_Ktala() != null) {
            _hashCode += getStr_Ktala().hashCode();
        }
        if (getStr_PassWord() != null) {
            _hashCode += getStr_PassWord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFjolskyldu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">GetFjolskyldu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str_Ktala");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "str_Ktala"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str_PassWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "str_PassWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
