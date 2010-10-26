/**
 * Plate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Plate  implements java.io.Serializable {
    private java.lang.String DATE;

    private java.lang.String REGNO;

    private java.lang.String REGGROUP;

    private java.lang.String REGGROUPNAME;

    public Plate() {
    }

    public Plate(
           java.lang.String DATE,
           java.lang.String REGNO,
           java.lang.String REGGROUP,
           java.lang.String REGGROUPNAME) {
           this.DATE = DATE;
           this.REGNO = REGNO;
           this.REGGROUP = REGGROUP;
           this.REGGROUPNAME = REGGROUPNAME;
    }


    /**
     * Gets the DATE value for this Plate.
     * 
     * @return DATE
     */
    public java.lang.String getDATE() {
        return DATE;
    }


    /**
     * Sets the DATE value for this Plate.
     * 
     * @param DATE
     */
    public void setDATE(java.lang.String DATE) {
        this.DATE = DATE;
    }


    /**
     * Gets the REGNO value for this Plate.
     * 
     * @return REGNO
     */
    public java.lang.String getREGNO() {
        return REGNO;
    }


    /**
     * Sets the REGNO value for this Plate.
     * 
     * @param REGNO
     */
    public void setREGNO(java.lang.String REGNO) {
        this.REGNO = REGNO;
    }


    /**
     * Gets the REGGROUP value for this Plate.
     * 
     * @return REGGROUP
     */
    public java.lang.String getREGGROUP() {
        return REGGROUP;
    }


    /**
     * Sets the REGGROUP value for this Plate.
     * 
     * @param REGGROUP
     */
    public void setREGGROUP(java.lang.String REGGROUP) {
        this.REGGROUP = REGGROUP;
    }


    /**
     * Gets the REGGROUPNAME value for this Plate.
     * 
     * @return REGGROUPNAME
     */
    public java.lang.String getREGGROUPNAME() {
        return REGGROUPNAME;
    }


    /**
     * Sets the REGGROUPNAME value for this Plate.
     * 
     * @param REGGROUPNAME
     */
    public void setREGGROUPNAME(java.lang.String REGGROUPNAME) {
        this.REGGROUPNAME = REGGROUPNAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Plate)) return false;
        Plate other = (Plate) obj;
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
            ((this.REGNO==null && other.getREGNO()==null) || 
             (this.REGNO!=null &&
              this.REGNO.equals(other.getREGNO()))) &&
            ((this.REGGROUP==null && other.getREGGROUP()==null) || 
             (this.REGGROUP!=null &&
              this.REGGROUP.equals(other.getREGGROUP()))) &&
            ((this.REGGROUPNAME==null && other.getREGGROUPNAME()==null) || 
             (this.REGGROUPNAME!=null &&
              this.REGGROUPNAME.equals(other.getREGGROUPNAME())));
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
        if (getREGNO() != null) {
            _hashCode += getREGNO().hashCode();
        }
        if (getREGGROUP() != null) {
            _hashCode += getREGGROUP().hashCode();
        }
        if (getREGGROUPNAME() != null) {
            _hashCode += getREGGROUPNAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Plate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Plate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGGROUPNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REGGROUPNAME"));
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
