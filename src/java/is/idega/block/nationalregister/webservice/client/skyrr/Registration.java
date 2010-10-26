/**
 * Registration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Registration  implements java.io.Serializable {
    private java.lang.String DATE;

    private java.lang.String TYPE;

    private java.lang.String SUBTYPE;

    public Registration() {
    }

    public Registration(
           java.lang.String DATE,
           java.lang.String TYPE,
           java.lang.String SUBTYPE) {
           this.DATE = DATE;
           this.TYPE = TYPE;
           this.SUBTYPE = SUBTYPE;
    }


    /**
     * Gets the DATE value for this Registration.
     * 
     * @return DATE
     */
    public java.lang.String getDATE() {
        return DATE;
    }


    /**
     * Sets the DATE value for this Registration.
     * 
     * @param DATE
     */
    public void setDATE(java.lang.String DATE) {
        this.DATE = DATE;
    }


    /**
     * Gets the TYPE value for this Registration.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this Registration.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the SUBTYPE value for this Registration.
     * 
     * @return SUBTYPE
     */
    public java.lang.String getSUBTYPE() {
        return SUBTYPE;
    }


    /**
     * Sets the SUBTYPE value for this Registration.
     * 
     * @param SUBTYPE
     */
    public void setSUBTYPE(java.lang.String SUBTYPE) {
        this.SUBTYPE = SUBTYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Registration)) return false;
        Registration other = (Registration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATE==null && other.getDATE()==null) || 
             (this.DATE!=null &&
              this.DATE.equals(other.getDATE()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.SUBTYPE==null && other.getSUBTYPE()==null) || 
             (this.SUBTYPE!=null &&
              this.SUBTYPE.equals(other.getSUBTYPE())));
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
        if (getDATE() != null) {
            _hashCode += getDATE().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getSUBTYPE() != null) {
            _hashCode += getSUBTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Registration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Registration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SUBTYPE"));
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
