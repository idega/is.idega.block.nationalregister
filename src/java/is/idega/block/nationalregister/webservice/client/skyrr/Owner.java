/**
 * Owner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Owner  implements java.io.Serializable {
    private java.lang.String PURCHASEDATE;

    private java.lang.String OWNREGDATE;

    private java.lang.String RECEPTIONDATE;

    private java.lang.String PERSIDNO;

    private java.lang.String FULLNAME;

    private java.lang.String ADDRESS;

    private java.lang.String POSTALCODE;

    private java.lang.String CITY;

    public Owner() {
    }

    public Owner(
           java.lang.String PURCHASEDATE,
           java.lang.String OWNREGDATE,
           java.lang.String RECEPTIONDATE,
           java.lang.String PERSIDNO,
           java.lang.String FULLNAME,
           java.lang.String ADDRESS,
           java.lang.String POSTALCODE,
           java.lang.String CITY) {
           this.PURCHASEDATE = PURCHASEDATE;
           this.OWNREGDATE = OWNREGDATE;
           this.RECEPTIONDATE = RECEPTIONDATE;
           this.PERSIDNO = PERSIDNO;
           this.FULLNAME = FULLNAME;
           this.ADDRESS = ADDRESS;
           this.POSTALCODE = POSTALCODE;
           this.CITY = CITY;
    }


    /**
     * Gets the PURCHASEDATE value for this Owner.
     * 
     * @return PURCHASEDATE
     */
    public java.lang.String getPURCHASEDATE() {
        return PURCHASEDATE;
    }


    /**
     * Sets the PURCHASEDATE value for this Owner.
     * 
     * @param PURCHASEDATE
     */
    public void setPURCHASEDATE(java.lang.String PURCHASEDATE) {
        this.PURCHASEDATE = PURCHASEDATE;
    }


    /**
     * Gets the OWNREGDATE value for this Owner.
     * 
     * @return OWNREGDATE
     */
    public java.lang.String getOWNREGDATE() {
        return OWNREGDATE;
    }


    /**
     * Sets the OWNREGDATE value for this Owner.
     * 
     * @param OWNREGDATE
     */
    public void setOWNREGDATE(java.lang.String OWNREGDATE) {
        this.OWNREGDATE = OWNREGDATE;
    }


    /**
     * Gets the RECEPTIONDATE value for this Owner.
     * 
     * @return RECEPTIONDATE
     */
    public java.lang.String getRECEPTIONDATE() {
        return RECEPTIONDATE;
    }


    /**
     * Sets the RECEPTIONDATE value for this Owner.
     * 
     * @param RECEPTIONDATE
     */
    public void setRECEPTIONDATE(java.lang.String RECEPTIONDATE) {
        this.RECEPTIONDATE = RECEPTIONDATE;
    }


    /**
     * Gets the PERSIDNO value for this Owner.
     * 
     * @return PERSIDNO
     */
    public java.lang.String getPERSIDNO() {
        return PERSIDNO;
    }


    /**
     * Sets the PERSIDNO value for this Owner.
     * 
     * @param PERSIDNO
     */
    public void setPERSIDNO(java.lang.String PERSIDNO) {
        this.PERSIDNO = PERSIDNO;
    }


    /**
     * Gets the FULLNAME value for this Owner.
     * 
     * @return FULLNAME
     */
    public java.lang.String getFULLNAME() {
        return FULLNAME;
    }


    /**
     * Sets the FULLNAME value for this Owner.
     * 
     * @param FULLNAME
     */
    public void setFULLNAME(java.lang.String FULLNAME) {
        this.FULLNAME = FULLNAME;
    }


    /**
     * Gets the ADDRESS value for this Owner.
     * 
     * @return ADDRESS
     */
    public java.lang.String getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this Owner.
     * 
     * @param ADDRESS
     */
    public void setADDRESS(java.lang.String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }


    /**
     * Gets the POSTALCODE value for this Owner.
     * 
     * @return POSTALCODE
     */
    public java.lang.String getPOSTALCODE() {
        return POSTALCODE;
    }


    /**
     * Sets the POSTALCODE value for this Owner.
     * 
     * @param POSTALCODE
     */
    public void setPOSTALCODE(java.lang.String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }


    /**
     * Gets the CITY value for this Owner.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this Owner.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Owner)) return false;
        Owner other = (Owner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PURCHASEDATE==null && other.getPURCHASEDATE()==null) || 
             (this.PURCHASEDATE!=null &&
              this.PURCHASEDATE.equals(other.getPURCHASEDATE()))) &&
            ((this.OWNREGDATE==null && other.getOWNREGDATE()==null) || 
             (this.OWNREGDATE!=null &&
              this.OWNREGDATE.equals(other.getOWNREGDATE()))) &&
            ((this.RECEPTIONDATE==null && other.getRECEPTIONDATE()==null) || 
             (this.RECEPTIONDATE!=null &&
              this.RECEPTIONDATE.equals(other.getRECEPTIONDATE()))) &&
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
        if (getPURCHASEDATE() != null) {
            _hashCode += getPURCHASEDATE().hashCode();
        }
        if (getOWNREGDATE() != null) {
            _hashCode += getOWNREGDATE().hashCode();
        }
        if (getRECEPTIONDATE() != null) {
            _hashCode += getRECEPTIONDATE().hashCode();
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
        new org.apache.axis.description.TypeDesc(Owner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Owner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PURCHASEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PURCHASEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNREGDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OWNREGDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECEPTIONDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RECEPTIONDATE"));
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
