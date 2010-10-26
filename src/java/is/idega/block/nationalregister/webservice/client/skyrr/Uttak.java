/**
 * Uttak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.idega.block.nationalregister.webservice.client.skyrr;

public class Uttak  implements java.io.Serializable {
    private boolean FANNST;

    private java.lang.String VILLA;

    private java.lang.String FJOLDINIDURSTADA;

    private java.lang.Object[] NIDURSTADA;

    public Uttak() {
    }

    public Uttak(
           boolean FANNST,
           java.lang.String VILLA,
           java.lang.String FJOLDINIDURSTADA,
           java.lang.Object[] NIDURSTADA) {
           this.FANNST = FANNST;
           this.VILLA = VILLA;
           this.FJOLDINIDURSTADA = FJOLDINIDURSTADA;
           this.NIDURSTADA = NIDURSTADA;
    }


    /**
     * Gets the FANNST value for this Uttak.
     * 
     * @return FANNST
     */
    public boolean isFANNST() {
        return FANNST;
    }


    /**
     * Sets the FANNST value for this Uttak.
     * 
     * @param FANNST
     */
    public void setFANNST(boolean FANNST) {
        this.FANNST = FANNST;
    }


    /**
     * Gets the VILLA value for this Uttak.
     * 
     * @return VILLA
     */
    public java.lang.String getVILLA() {
        return VILLA;
    }


    /**
     * Sets the VILLA value for this Uttak.
     * 
     * @param VILLA
     */
    public void setVILLA(java.lang.String VILLA) {
        this.VILLA = VILLA;
    }


    /**
     * Gets the FJOLDINIDURSTADA value for this Uttak.
     * 
     * @return FJOLDINIDURSTADA
     */
    public java.lang.String getFJOLDINIDURSTADA() {
        return FJOLDINIDURSTADA;
    }


    /**
     * Sets the FJOLDINIDURSTADA value for this Uttak.
     * 
     * @param FJOLDINIDURSTADA
     */
    public void setFJOLDINIDURSTADA(java.lang.String FJOLDINIDURSTADA) {
        this.FJOLDINIDURSTADA = FJOLDINIDURSTADA;
    }


    /**
     * Gets the NIDURSTADA value for this Uttak.
     * 
     * @return NIDURSTADA
     */
    public java.lang.Object[] getNIDURSTADA() {
        return NIDURSTADA;
    }


    /**
     * Sets the NIDURSTADA value for this Uttak.
     * 
     * @param NIDURSTADA
     */
    public void setNIDURSTADA(java.lang.Object[] NIDURSTADA) {
        this.NIDURSTADA = NIDURSTADA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Uttak)) return false;
        Uttak other = (Uttak) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.FANNST == other.isFANNST() &&
            ((this.VILLA==null && other.getVILLA()==null) || 
             (this.VILLA!=null &&
              this.VILLA.equals(other.getVILLA()))) &&
            ((this.FJOLDINIDURSTADA==null && other.getFJOLDINIDURSTADA()==null) || 
             (this.FJOLDINIDURSTADA!=null &&
              this.FJOLDINIDURSTADA.equals(other.getFJOLDINIDURSTADA()))) &&
            ((this.NIDURSTADA==null && other.getNIDURSTADA()==null) || 
             (this.NIDURSTADA!=null &&
              java.util.Arrays.equals(this.NIDURSTADA, other.getNIDURSTADA())));
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
        _hashCode += (isFANNST() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVILLA() != null) {
            _hashCode += getVILLA().hashCode();
        }
        if (getFJOLDINIDURSTADA() != null) {
            _hashCode += getFJOLDINIDURSTADA().hashCode();
        }
        if (getNIDURSTADA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNIDURSTADA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNIDURSTADA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Uttak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Uttak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FANNST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FANNST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VILLA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VILLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FJOLDINIDURSTADA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FJOLDINIDURSTADA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIDURSTADA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NIDURSTADA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
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
