/**
 * Inspection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Inspection  implements java.io.Serializable {
    private java.lang.String DATE;

    private java.lang.String STATION;

    private java.lang.String TYPE;

    private java.lang.String OFFICER;

    private java.lang.String RESULT;

    private java.lang.String ODOMETER;

    public Inspection() {
    }

    public Inspection(
           java.lang.String DATE,
           java.lang.String STATION,
           java.lang.String TYPE,
           java.lang.String OFFICER,
           java.lang.String RESULT,
           java.lang.String ODOMETER) {
           this.DATE = DATE;
           this.STATION = STATION;
           this.TYPE = TYPE;
           this.OFFICER = OFFICER;
           this.RESULT = RESULT;
           this.ODOMETER = ODOMETER;
    }


    /**
     * Gets the DATE value for this Inspection.
     * 
     * @return DATE
     */
    public java.lang.String getDATE() {
        return DATE;
    }


    /**
     * Sets the DATE value for this Inspection.
     * 
     * @param DATE
     */
    public void setDATE(java.lang.String DATE) {
        this.DATE = DATE;
    }


    /**
     * Gets the STATION value for this Inspection.
     * 
     * @return STATION
     */
    public java.lang.String getSTATION() {
        return STATION;
    }


    /**
     * Sets the STATION value for this Inspection.
     * 
     * @param STATION
     */
    public void setSTATION(java.lang.String STATION) {
        this.STATION = STATION;
    }


    /**
     * Gets the TYPE value for this Inspection.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this Inspection.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the OFFICER value for this Inspection.
     * 
     * @return OFFICER
     */
    public java.lang.String getOFFICER() {
        return OFFICER;
    }


    /**
     * Sets the OFFICER value for this Inspection.
     * 
     * @param OFFICER
     */
    public void setOFFICER(java.lang.String OFFICER) {
        this.OFFICER = OFFICER;
    }


    /**
     * Gets the RESULT value for this Inspection.
     * 
     * @return RESULT
     */
    public java.lang.String getRESULT() {
        return RESULT;
    }


    /**
     * Sets the RESULT value for this Inspection.
     * 
     * @param RESULT
     */
    public void setRESULT(java.lang.String RESULT) {
        this.RESULT = RESULT;
    }


    /**
     * Gets the ODOMETER value for this Inspection.
     * 
     * @return ODOMETER
     */
    public java.lang.String getODOMETER() {
        return ODOMETER;
    }


    /**
     * Sets the ODOMETER value for this Inspection.
     * 
     * @param ODOMETER
     */
    public void setODOMETER(java.lang.String ODOMETER) {
        this.ODOMETER = ODOMETER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inspection)) return false;
        Inspection other = (Inspection) obj;
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
            ((this.STATION==null && other.getSTATION()==null) || 
             (this.STATION!=null &&
              this.STATION.equals(other.getSTATION()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.OFFICER==null && other.getOFFICER()==null) || 
             (this.OFFICER!=null &&
              this.OFFICER.equals(other.getOFFICER()))) &&
            ((this.RESULT==null && other.getRESULT()==null) || 
             (this.RESULT!=null &&
              this.RESULT.equals(other.getRESULT()))) &&
            ((this.ODOMETER==null && other.getODOMETER()==null) || 
             (this.ODOMETER!=null &&
              this.ODOMETER.equals(other.getODOMETER())));
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
        if (getSTATION() != null) {
            _hashCode += getSTATION().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getOFFICER() != null) {
            _hashCode += getOFFICER().hashCode();
        }
        if (getRESULT() != null) {
            _hashCode += getRESULT().hashCode();
        }
        if (getODOMETER() != null) {
            _hashCode += getODOMETER().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Inspection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Inspection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "STATION"));
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
        elemField.setFieldName("OFFICER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OFFICER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RESULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ODOMETER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ODOMETER"));
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
