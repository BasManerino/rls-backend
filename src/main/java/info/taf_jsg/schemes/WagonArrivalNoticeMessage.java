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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageHeader"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}WagonInformation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ArrivalAtDestination"/>
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
    "messageHeader",
    "wagonInformation",
    "arrivalAtDestination"
})
@XmlRootElement(name = "WagonArrivalNoticeMessage")
public class WagonArrivalNoticeMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "WagonInformation", required = true)
    protected WagonInformation wagonInformation;
    @XmlElement(name = "ArrivalAtDestination", required = true)
    protected ArrivalAtDestination arrivalAtDestination;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the wagonInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WagonInformation }
     *     
     */
    public WagonInformation getWagonInformation() {
        return wagonInformation;
    }

    /**
     * Sets the value of the wagonInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WagonInformation }
     *     
     */
    public void setWagonInformation(WagonInformation value) {
        this.wagonInformation = value;
    }

    /**
     * Gets the value of the arrivalAtDestination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalAtDestination }
     *     
     */
    public ArrivalAtDestination getArrivalAtDestination() {
        return arrivalAtDestination;
    }

    /**
     * Sets the value of the arrivalAtDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalAtDestination }
     *     
     */
    public void setArrivalAtDestination(ArrivalAtDestination value) {
        this.arrivalAtDestination = value;
    }

}
