/**
 * XMO0003.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class XMO0003  implements java.io.Serializable {
    private java.lang.String sUppruni;

    private java.lang.String sKT_Greidanda;

    private java.lang.String sKT_Notanda;

    private java.lang.String p_sPassword;

    private java.lang.String sFastnr;

    private java.lang.String sSkranNumer;

    public XMO0003() {
    }

    public XMO0003(
           java.lang.String sUppruni,
           java.lang.String sKT_Greidanda,
           java.lang.String sKT_Notanda,
           java.lang.String p_sPassword,
           java.lang.String sFastnr,
           java.lang.String sSkranNumer) {
           this.sUppruni = sUppruni;
           this.sKT_Greidanda = sKT_Greidanda;
           this.sKT_Notanda = sKT_Notanda;
           this.p_sPassword = p_sPassword;
           this.sFastnr = sFastnr;
           this.sSkranNumer = sSkranNumer;
    }


    /**
     * Gets the sUppruni value for this XMO0003.
     * 
     * @return sUppruni
     */
    public java.lang.String getSUppruni() {
        return sUppruni;
    }


    /**
     * Sets the sUppruni value for this XMO0003.
     * 
     * @param sUppruni
     */
    public void setSUppruni(java.lang.String sUppruni) {
        this.sUppruni = sUppruni;
    }


    /**
     * Gets the sKT_Greidanda value for this XMO0003.
     * 
     * @return sKT_Greidanda
     */
    public java.lang.String getSKT_Greidanda() {
        return sKT_Greidanda;
    }


    /**
     * Sets the sKT_Greidanda value for this XMO0003.
     * 
     * @param sKT_Greidanda
     */
    public void setSKT_Greidanda(java.lang.String sKT_Greidanda) {
        this.sKT_Greidanda = sKT_Greidanda;
    }


    /**
     * Gets the sKT_Notanda value for this XMO0003.
     * 
     * @return sKT_Notanda
     */
    public java.lang.String getSKT_Notanda() {
        return sKT_Notanda;
    }


    /**
     * Sets the sKT_Notanda value for this XMO0003.
     * 
     * @param sKT_Notanda
     */
    public void setSKT_Notanda(java.lang.String sKT_Notanda) {
        this.sKT_Notanda = sKT_Notanda;
    }


    /**
     * Gets the p_sPassword value for this XMO0003.
     * 
     * @return p_sPassword
     */
    public java.lang.String getP_sPassword() {
        return p_sPassword;
    }


    /**
     * Sets the p_sPassword value for this XMO0003.
     * 
     * @param p_sPassword
     */
    public void setP_sPassword(java.lang.String p_sPassword) {
        this.p_sPassword = p_sPassword;
    }


    /**
     * Gets the sFastnr value for this XMO0003.
     * 
     * @return sFastnr
     */
    public java.lang.String getSFastnr() {
        return sFastnr;
    }


    /**
     * Sets the sFastnr value for this XMO0003.
     * 
     * @param sFastnr
     */
    public void setSFastnr(java.lang.String sFastnr) {
        this.sFastnr = sFastnr;
    }


    /**
     * Gets the sSkranNumer value for this XMO0003.
     * 
     * @return sSkranNumer
     */
    public java.lang.String getSSkranNumer() {
        return sSkranNumer;
    }


    /**
     * Sets the sSkranNumer value for this XMO0003.
     * 
     * @param sSkranNumer
     */
    public void setSSkranNumer(java.lang.String sSkranNumer) {
        this.sSkranNumer = sSkranNumer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMO0003)) return false;
        XMO0003 other = (XMO0003) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sUppruni==null && other.getSUppruni()==null) || 
             (this.sUppruni!=null &&
              this.sUppruni.equals(other.getSUppruni()))) &&
            ((this.sKT_Greidanda==null && other.getSKT_Greidanda()==null) || 
             (this.sKT_Greidanda!=null &&
              this.sKT_Greidanda.equals(other.getSKT_Greidanda()))) &&
            ((this.sKT_Notanda==null && other.getSKT_Notanda()==null) || 
             (this.sKT_Notanda!=null &&
              this.sKT_Notanda.equals(other.getSKT_Notanda()))) &&
            ((this.p_sPassword==null && other.getP_sPassword()==null) || 
             (this.p_sPassword!=null &&
              this.p_sPassword.equals(other.getP_sPassword()))) &&
            ((this.sFastnr==null && other.getSFastnr()==null) || 
             (this.sFastnr!=null &&
              this.sFastnr.equals(other.getSFastnr()))) &&
            ((this.sSkranNumer==null && other.getSSkranNumer()==null) || 
             (this.sSkranNumer!=null &&
              this.sSkranNumer.equals(other.getSSkranNumer())));
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
        if (getSUppruni() != null) {
            _hashCode += getSUppruni().hashCode();
        }
        if (getSKT_Greidanda() != null) {
            _hashCode += getSKT_Greidanda().hashCode();
        }
        if (getSKT_Notanda() != null) {
            _hashCode += getSKT_Notanda().hashCode();
        }
        if (getP_sPassword() != null) {
            _hashCode += getP_sPassword().hashCode();
        }
        if (getSFastnr() != null) {
            _hashCode += getSFastnr().hashCode();
        }
        if (getSSkranNumer() != null) {
            _hashCode += getSSkranNumer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMO0003.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">XMO0003"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUppruni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sUppruni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKT_Greidanda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sKT_Greidanda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKT_Notanda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sKT_Notanda"));
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
        elemField.setFieldName("SFastnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sFastnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSkranNumer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sSkranNumer"));
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
