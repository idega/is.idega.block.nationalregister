/**
 * XML_FJOLSK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.ferli;

public class XML_FJOLSK  implements java.io.Serializable {
    private is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSKFjolskylda fjolskylda;

    private java.lang.String retkod;

    private java.lang.String retLys;

    public XML_FJOLSK() {
    }

    public XML_FJOLSK(
           is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSKFjolskylda fjolskylda,
           java.lang.String retkod,
           java.lang.String retLys) {
           this.fjolskylda = fjolskylda;
           this.retkod = retkod;
           this.retLys = retLys;
    }


    /**
     * Gets the fjolskylda value for this XML_FJOLSK.
     * 
     * @return fjolskylda
     */
    public is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSKFjolskylda getFjolskylda() {
        return fjolskylda;
    }


    /**
     * Sets the fjolskylda value for this XML_FJOLSK.
     * 
     * @param fjolskylda
     */
    public void setFjolskylda(is.idega.block.nationalregister.webservice.client.ferli.XML_FJOLSKFjolskylda fjolskylda) {
        this.fjolskylda = fjolskylda;
    }


    /**
     * Gets the retkod value for this XML_FJOLSK.
     * 
     * @return retkod
     */
    public java.lang.String getRetkod() {
        return retkod;
    }


    /**
     * Sets the retkod value for this XML_FJOLSK.
     * 
     * @param retkod
     */
    public void setRetkod(java.lang.String retkod) {
        this.retkod = retkod;
    }


    /**
     * Gets the retLys value for this XML_FJOLSK.
     * 
     * @return retLys
     */
    public java.lang.String getRetLys() {
        return retLys;
    }


    /**
     * Sets the retLys value for this XML_FJOLSK.
     * 
     * @param retLys
     */
    public void setRetLys(java.lang.String retLys) {
        this.retLys = retLys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XML_FJOLSK)) return false;
        XML_FJOLSK other = (XML_FJOLSK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fjolskylda==null && other.getFjolskylda()==null) || 
             (this.fjolskylda!=null &&
              this.fjolskylda.equals(other.getFjolskylda()))) &&
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
        if (getFjolskylda() != null) {
            _hashCode += getFjolskylda().hashCode();
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
        new org.apache.axis.description.TypeDesc(XML_FJOLSK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", "XML_FJOLSK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fjolskylda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml.ferli.is", "Fjolskylda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.ferli.is", ">XML_FJOLSK>Fjolskylda"));
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
