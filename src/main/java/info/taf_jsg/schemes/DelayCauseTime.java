//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayCause"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayMinutes"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayEventDateTime"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}InternalReferenceIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayCodingDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delayCause",
    "delayMinutes",
    "delayEventDateTime",
    "internalReferenceIdentifier",
    "delayCodingDateTime",
    "remarks"
})
@XmlRootElement(name = "DelayCauseTime")
public class DelayCauseTime {

    @XmlElement(name = "DelayCause", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String delayCause;
    @XmlElement(name = "DelayMinutes", required = true)
    protected String delayMinutes;
    @XmlElement(name = "DelayEventDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayEventDateTime;
    @XmlElement(name = "InternalReferenceIdentifier")
    protected String internalReferenceIdentifier;
    @XmlElement(name = "DelayCodingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayCodingDateTime;
    @XmlElement(name = "Remarks")
    protected String remarks;

    /**
     * Describes the reason for a delay
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayCause() {
        return delayCause;
    }

    /**
     * Sets the value of the delayCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayCause(String value) {
        this.delayCause = value;
    }

    /**
     * Gets the value of the delayMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayMinutes() {
        return delayMinutes;
    }

    /**
     * Sets the value of the delayMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayMinutes(String value) {
        this.delayMinutes = value;
    }

    /**
     * Gets the value of the delayEventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayEventDateTime() {
        return delayEventDateTime;
    }

    /**
     * Sets the value of the delayEventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayEventDateTime(XMLGregorianCalendar value) {
        this.delayEventDateTime = value;
    }

    /**
     * The liink to the System Reference
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReferenceIdentifier() {
        return internalReferenceIdentifier;
    }

    /**
     * Sets the value of the internalReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReferenceIdentifier(String value) {
        this.internalReferenceIdentifier = value;
    }

    /**
     * Date and Time of the ocding of the delay
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayCodingDateTime() {
        return delayCodingDateTime;
    }

    /**
     * Sets the value of the delayCodingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayCodingDateTime(XMLGregorianCalendar value) {
        this.delayCodingDateTime = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
