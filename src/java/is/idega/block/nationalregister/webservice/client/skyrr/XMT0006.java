/**
 * XMT0006.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMT0006  implements java.io.Serializable {
    private java.lang.String p_sUppruni;

    private java.lang.String p_sKtGreid;

    private java.lang.String p_sKtNot;

    private java.lang.String p_sPassword;

    private java.lang.String m_sKennitala;

    public XMT0006() {
    }

    public XMT0006(
           java.lang.String p_sUppruni,
           java.lang.String p_sKtGreid,
           java.lang.String p_sKtNot,
           java.lang.String p_sPassword,
           java.lang.String m_sKennitala) {
           this.p_sUppruni = p_sUppruni;
           this.p_sKtGreid = p_sKtGreid;
           this.p_sKtNot = p_sKtNot;
           this.p_sPassword = p_sPassword;
           this.m_sKennitala = m_sKennitala;
    }


    /**
     * Gets the p_sUppruni value for this XMT0006.
     * 
     * @return p_sUppruni
     */
    public java.lang.String getP_sUppruni() {
        return p_sUppruni;
    }


    /**
     * Sets the p_sUppruni value for this XMT0006.
     * 
     * @param p_sUppruni
     */
    public void setP_sUppruni(java.lang.String p_sUppruni) {
        this.p_sUppruni = p_sUppruni;
    }


    /**
     * Gets the p_sKtGreid value for this XMT0006.
     * 
     * @return p_sKtGreid
     */
    public java.lang.String getP_sKtGreid() {
        return p_sKtGreid;
    }


    /**
     * Sets the p_sKtGreid value for this XMT0006.
     * 
     * @param p_sKtGreid
     */
    public void setP_sKtGreid(java.lang.String p_sKtGreid) {
        this.p_sKtGreid = p_sKtGreid;
    }


    /**
     * Gets the p_sKtNot value for this XMT0006.
     * 
     * @return p_sKtNot
     */
    public java.lang.String getP_sKtNot() {
        return p_sKtNot;
    }


    /**
     * Sets the p_sKtNot value for this XMT0006.
     * 
     * @param p_sKtNot
     */
    public void setP_sKtNot(java.lang.String p_sKtNot) {
        this.p_sKtNot = p_sKtNot;
    }


    /**
     * Gets the p_sPassword value for this XMT0006.
     * 
     * @return p_sPassword
     */
    public java.lang.String getP_sPassword() {
        return p_sPassword;
    }


    /**
     * Sets the p_sPassword value for this XMT0006.
     * 
     * @param p_sPassword
     */
    public void setP_sPassword(java.lang.String p_sPassword) {
        this.p_sPassword = p_sPassword;
    }


    /**
     * Gets the m_sKennitala value for this XMT0006.
     * 
     * @return m_sKennitala
     */
    public java.lang.String getM_sKennitala() {
        return m_sKennitala;
    }


    /**
     * Sets the m_sKennitala value for this XMT0006.
     * 
     * @param m_sKennitala
     */
    public void setM_sKennitala(java.lang.String m_sKennitala) {
        this.m_sKennitala = m_sKennitala;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMT0006)) return false;
        XMT0006 other = (XMT0006) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.p_sUppruni==null && other.getP_sUppruni()==null) || 
             (this.p_sUppruni!=null &&
              this.p_sUppruni.equals(other.getP_sUppruni()))) &&
            ((this.p_sKtGreid==null && other.getP_sKtGreid()==null) || 
             (this.p_sKtGreid!=null &&
              this.p_sKtGreid.equals(other.getP_sKtGreid()))) &&
            ((this.p_sKtNot==null && other.getP_sKtNot()==null) || 
             (this.p_sKtNot!=null &&
              this.p_sKtNot.equals(other.getP_sKtNot()))) &&
            ((this.p_sPassword==null && other.getP_sPassword()==null) || 
             (this.p_sPassword!=null &&
              this.p_sPassword.equals(other.getP_sPassword()))) &&
            ((this.m_sKennitala==null && other.getM_sKennitala()==null) || 
             (this.m_sKennitala!=null &&
              this.m_sKennitala.equals(other.getM_sKennitala())));
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
        if (getP_sUppruni() != null) {
            _hashCode += getP_sUppruni().hashCode();
        }
        if (getP_sKtGreid() != null) {
            _hashCode += getP_sKtGreid().hashCode();
        }
        if (getP_sKtNot() != null) {
            _hashCode += getP_sKtNot().hashCode();
        }
        if (getP_sPassword() != null) {
            _hashCode += getP_sPassword().hashCode();
        }
        if (getM_sKennitala() != null) {
            _hashCode += getM_sKennitala().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMT0006.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMT0006"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_sUppruni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "p_sUppruni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_sKtGreid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "p_sKtGreid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_sKtNot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "p_sKtNot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_sPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "p_sPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sKennitala");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "m_sKennitala"));
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
