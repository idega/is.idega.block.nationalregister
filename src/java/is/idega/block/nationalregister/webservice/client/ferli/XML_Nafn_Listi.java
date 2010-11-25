/**
 * XML_Nafn_Listi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class XML_Nafn_Listi  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_ListiNafnalisti nafnalisti;

    private java.lang.String fleiriNafnar;

    private java.lang.String retkod;

    private java.lang.String retLys;

    public XML_Nafn_Listi() {
    }

    public XML_Nafn_Listi(
           is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_ListiNafnalisti nafnalisti,
           java.lang.String fleiriNafnar,
           java.lang.String retkod,
           java.lang.String retLys) {
           this.nafnalisti = nafnalisti;
           this.fleiriNafnar = fleiriNafnar;
           this.retkod = retkod;
           this.retLys = retLys;
    }


    /**
     * Gets the nafnalisti value for this XML_Nafn_Listi.
     * 
     * @return nafnalisti
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_ListiNafnalisti getNafnalisti() {
        return nafnalisti;
    }


    /**
     * Sets the nafnalisti value for this XML_Nafn_Listi.
     * 
     * @param nafnalisti
     */
    public void setNafnalisti(is.idega.block.nationalregister.webservice.client.ferli.XML_Nafn_ListiNafnalisti nafnalisti) {
        this.nafnalisti = nafnalisti;
    }


    /**
     * Gets the fleiriNafnar value for this XML_Nafn_Listi.
     * 
     * @return fleiriNafnar
     */
    public java.lang.String getFleiriNafnar() {
        return fleiriNafnar;
    }


    /**
     * Sets the fleiriNafnar value for this XML_Nafn_Listi.
     * 
     * @param fleiriNafnar
     */
    public void setFleiriNafnar(java.lang.String fleiriNafnar) {
        this.fleiriNafnar = fleiriNafnar;
    }


    /**
     * Gets the retkod value for this XML_Nafn_Listi.
     * 
     * @return retkod
     */
    public java.lang.String getRetkod() {
        return retkod;
    }


    /**
     * Sets the retkod value for this XML_Nafn_Listi.
     * 
     * @param retkod
     */
    public void setRetkod(java.lang.String retkod) {
        this.retkod = retkod;
    }


    /**
     * Gets the retLys value for this XML_Nafn_Listi.
     * 
     * @return retLys
     */
    public java.lang.String getRetLys() {
        return retLys;
    }


    /**
     * Sets the retLys value for this XML_Nafn_Listi.
     * 
     * @param retLys
     */
    public void setRetLys(java.lang.String retLys) {
        this.retLys = retLys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XML_Nafn_Listi)) return false;
        XML_Nafn_Listi other = (XML_Nafn_Listi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nafnalisti==null && other.getNafnalisti()==null) || 
             (this.nafnalisti!=null &&
              this.nafnalisti.equals(other.getNafnalisti()))) &&
            ((this.fleiriNafnar==null && other.getFleiriNafnar()==null) || 
             (this.fleiriNafnar!=null &&
              this.fleiriNafnar.equals(other.getFleiriNafnar()))) &&
            ((this.retkod==null && other.getRetkod()==null) || 
             (this.retkod!=null &&
              this.retkod.equals(other.getRetkod()))) &&
            ((this.retLys==null && other.getRetLys()==null) || 
             (this.retLys!=null &&
              this.retLys.equals(other.getRetLys())));
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
        if (getNafnalisti() != null) {
            _hashCode += getNafnalisti().hashCode();
        }
        if (getFleiriNafnar() != null) {
            _hashCode += getFleiriNafnar().hashCode();
        }
        if (getRetkod() != null) {
            _hashCode += getRetkod().hashCode();
        }
        if (getRetLys() != null) {
            _hashCode += getRetLys().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XML_Nafn_Listi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_Nafn_Listi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nafnalisti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "Nafnalisti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">XML_Nafn_Listi>Nafnalisti"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fleiriNafnar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "FleiriNafnar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retkod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "Retkod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retLys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "RetLys"));
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
