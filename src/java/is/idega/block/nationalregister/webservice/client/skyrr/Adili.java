/**
 * Adili.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Adili  implements java.io.Serializable {
    private java.lang.String nafn;

    private java.lang.String KT;

    public Adili() {
    }

    public Adili(
           java.lang.String nafn,
           java.lang.String KT) {
           this.nafn = nafn;
           this.KT = KT;
    }


    /**
     * Gets the nafn value for this Adili.
     * 
     * @return nafn
     */
    public java.lang.String getNafn() {
        return nafn;
    }


    /**
     * Sets the nafn value for this Adili.
     * 
     * @param nafn
     */
    public void setNafn(java.lang.String nafn) {
        this.nafn = nafn;
    }


    /**
     * Gets the KT value for this Adili.
     * 
     * @return KT
     */
    public java.lang.String getKT() {
        return KT;
    }


    /**
     * Sets the KT value for this Adili.
     * 
     * @param KT
     */
    public void setKT(java.lang.String KT) {
        this.KT = KT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adili)) return false;
        Adili other = (Adili) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nafn==null && other.getNafn()==null) || 
             (this.nafn!=null &&
              this.nafn.equals(other.getNafn()))) &&
            ((this.KT==null && other.getKT()==null) || 
             (this.KT!=null &&
              this.KT.equals(other.getKT())));
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
        if (getNafn() != null) {
            _hashCode += getNafn().hashCode();
        }
        if (getKT() != null) {
            _hashCode += getKT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adili.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Adili"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nafn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nafn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "KT"));
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
