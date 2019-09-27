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
 *         &lt;element ref="{http://taf-jsg.info/schemes}Location"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}LocationDateTime"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainLocationStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BookedLocationDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ReferencedLocationDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainDelay" minOccurs="0"/>
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
    "location",
    "locationDateTime",
    "trainLocationStatus",
    "bookedLocationDateTime",
    "referencedLocationDateTime",
    "trainDelay"
})
@XmlRootElement(name = "TrainLocationReport")
public class TrainLocationReport {

    @XmlElement(name = "Location", required = true)
    protected LocationIdent location;
    @XmlElement(name = "LocationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar locationDateTime;
    @XmlElement(name = "TrainLocationStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trainLocationStatus;
    @XmlElement(name = "BookedLocationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookedLocationDateTime;
    @XmlElement(name = "ReferencedLocationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referencedLocationDateTime;
    @XmlElement(name = "TrainDelay")
    protected TrainDelay trainDelay;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setLocation(LocationIdent value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocationDateTime() {
        return locationDateTime;
    }

    /**
     * Sets the value of the locationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocationDateTime(XMLGregorianCalendar value) {
        this.locationDateTime = value;
    }

    /**
     * Gets the value of the trainLocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainLocationStatus() {
        return trainLocationStatus;
    }

    /**
     * Sets the value of the trainLocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainLocationStatus(String value) {
        this.trainLocationStatus = value;
    }

    /**
     * Scheduled Date and Time of a train at a
     * 							specified location as defined in the path contract
     * 						
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookedLocationDateTime() {
        return bookedLocationDateTime;
    }

    /**
     * Sets the value of the bookedLocationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookedLocationDateTime(XMLGregorianCalendar value) {
        this.bookedLocationDateTime = value;
    }

    /**
     * Gets the value of the referencedLocationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferencedLocationDateTime() {
        return referencedLocationDateTime;
    }

    /**
     * Sets the value of the referencedLocationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferencedLocationDateTime(XMLGregorianCalendar value) {
        this.referencedLocationDateTime = value;
    }

    /**
     * Gets the value of the trainDelay property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDelay }
     *     
     */
    public TrainDelay getTrainDelay() {
        return trainDelay;
    }

    /**
     * Sets the value of the trainDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDelay }
     *     
     */
    public void setTrainDelay(TrainDelay value) {
        this.trainDelay = value;
    }

}