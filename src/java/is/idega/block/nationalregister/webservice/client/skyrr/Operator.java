/**
 * Operator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Operator  implements java.io.Serializable {
    private java.lang.String MAINOPERATOR;

    private java.lang.String SERIAL;

    private java.lang.String STARTDATE;

    private java.lang.String ENDDATE;

    private java.lang.String PERSIDNO;

    private java.lang.String FULLNAME;

    private java.lang.String ADDRESS;

    private java.lang.String POSTALCODE;

    private java.lang.String CITY;

    public Operator() {
    }

    public Operator(
           java.lang.String MAINOPERATOR,
           java.lang.String SERIAL,
           java.lang.String STARTDATE,
           java.lang.String ENDDATE,
           java.lang.String PERSIDNO,
           java.lang.String FULLNAME,
           java.lang.String ADDRESS,
           java.lang.String POSTALCODE,
           java.lang.String CITY) {
           this.MAINOPERATOR = MAINOPERATOR;
           this.SERIAL = SERIAL;
           this.STARTDATE = STARTDATE;
           this.ENDDATE = ENDDATE;
           this.PERSIDNO = PERSIDNO;
           this.FULLNAME = FULLNAME;
           this.ADDRESS = ADDRESS;
           this.POSTALCODE = POSTALCODE;
           this.CITY = CITY;
    }


    /**
     * Gets the MAINOPERATOR value for this Operator.
     * 
     * @return MAINOPERATOR
     */
    public java.lang.String getMAINOPERATOR() {
        return MAINOPERATOR;
    }


    /**
     * Sets the MAINOPERATOR value for this Operator.
     * 
     * @param MAINOPERATOR
     */
    public void setMAINOPERATOR(java.lang.String MAINOPERATOR) {
        this.MAINOPERATOR = MAINOPERATOR;
    }


    /**
     * Gets the SERIAL value for this Operator.
     * 
     * @return SERIAL
     */
    public java.lang.String getSERIAL() {
        return SERIAL;
    }


    /**
     * Sets the SERIAL value for this Operator.
     * 
     * @param SERIAL
     */
    public void setSERIAL(java.lang.String SERIAL) {
        this.SERIAL = SERIAL;
    }


    /**
     * Gets the STARTDATE value for this Operator.
     * 
     * @return STARTDATE
     */
    public java.lang.String getSTARTDATE() {
        return STARTDATE;
    }


    /**
     * Sets the STARTDATE value for this Operator.
     * 
     * @param STARTDATE
     */
    public void setSTARTDATE(java.lang.String STARTDATE) {
        this.STARTDATE = STARTDATE;
    }


    /**
     * Gets the ENDDATE value for this Operator.
     * 
     * @return ENDDATE
     */
    public java.lang.String getENDDATE() {
        return ENDDATE;
    }


    /**
     * Sets the ENDDATE value for this Operator.
     * 
     * @param ENDDATE
     */
    public void setENDDATE(java.lang.String ENDDATE) {
        this.ENDDATE = ENDDATE;
    }


    /**
     * Gets the PERSIDNO value for this Operator.
     * 
     * @return PERSIDNO
     */
    public java.lang.String getPERSIDNO() {
        return PERSIDNO;
    }


    /**
     * Sets the PERSIDNO value for this Operator.
     * 
     * @param PERSIDNO
     */
    public void setPERSIDNO(java.lang.String PERSIDNO) {
        this.PERSIDNO = PERSIDNO;
    }


    /**
     * Gets the FULLNAME value for this Operator.
     * 
     * @return FULLNAME
     */
    public java.lang.String getFULLNAME() {
        return FULLNAME;
    }


    /**
     * Sets the FULLNAME value for this Operator.
     * 
     * @param FULLNAME
     */
    public void setFULLNAME(java.lang.String FULLNAME) {
        this.FULLNAME = FULLNAME;
    }


    /**
     * Gets the ADDRESS value for this Operator.
     * 
     * @return ADDRESS
     */
    public java.lang.String getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this Operator.
     * 
     * @param ADDRESS
     */
    public void setADDRESS(java.lang.String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }


    /**
     * Gets the POSTALCODE value for this Operator.
     * 
     * @return POSTALCODE
     */
    public java.lang.String getPOSTALCODE() {
        return POSTALCODE;
    }


    /**
     * Sets the POSTALCODE value for this Operator.
     * 
     * @param POSTALCODE
     */
    public void setPOSTALCODE(java.lang.String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }


    /**
     * Gets the CITY value for this Operator.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this Operator.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operator)) return false;
        Operator other = (Operator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MAINOPERATOR==null && other.getMAINOPERATOR()==null) || 
             (this.MAINOPERATOR!=null &&
              this.MAINOPERATOR.equals(other.getMAINOPERATOR()))) &&
            ((this.SERIAL==null && other.getSERIAL()==null) || 
             (this.SERIAL!=null &&
              this.SERIAL.equals(other.getSERIAL()))) &&
            ((this.STARTDATE==null && other.getSTARTDATE()==null) || 
             (this.STARTDATE!=null &&
              this.STARTDATE.equals(other.getSTARTDATE()))) &&
            ((this.ENDDATE==null && other.getENDDATE()==null) || 
             (this.ENDDATE!=null &&
              this.ENDDATE.equals(other.getENDDATE()))) &&
            ((this.PERSIDNO==null && other.getPERSIDNO()==null) || 
             (this.PERSIDNO!=null &&
              this.PERSIDNO.equals(other.getPERSIDNO()))) &&
            ((this.FULLNAME==null && other.getFULLNAME()==null) || 
             (this.FULLNAME!=null &&
              this.FULLNAME.equals(other.getFULLNAME()))) &&
            ((this.ADDRESS==null && other.getADDRESS()==null) || 
             (this.ADDRESS!=null &&
              this.ADDRESS.equals(other.getADDRESS()))) &&
            ((this.POSTALCODE==null && other.getPOSTALCODE()==null) || 
             (this.POSTALCODE!=null &&
              this.POSTALCODE.equals(other.getPOSTALCODE()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY())));
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
        if (getMAINOPERATOR() != null) {
            _hashCode += getMAINOPERATOR().hashCode();
        }
        if (getSERIAL() != null) {
            _hashCode += getSERIAL().hashCode();
        }
        if (getSTARTDATE() != null) {
            _hashCode += getSTARTDATE().hashCode();
        }
        if (getENDDATE() != null) {
            _hashCode += getENDDATE().hashCode();
        }
        if (getPERSIDNO() != null) {
            _hashCode += getPERSIDNO().hashCode();
        }
        if (getFULLNAME() != null) {
            _hashCode += getFULLNAME().hashCode();
        }
        if (getADDRESS() != null) {
            _hashCode += getADDRESS().hashCode();
        }
        if (getPOSTALCODE() != null) {
            _hashCode += getPOSTALCODE().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Operator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAINOPERATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MAINOPERATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SERIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STARTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "STARTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ENDDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSIDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PERSIDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FULLNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FULLNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSTALCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "POSTALCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CITY"));
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
