//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainType" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}Length" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainWeight" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakingRatio" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakeWeight" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakeType" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainCC_System" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainRadioSystem" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainMaxSpeed" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TiltingFunction" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MaxAxleWeight" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}NumberOfAxles" minOccurs="0"/>
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
    "trainType",
    "length",
    "trainWeight",
    "brakingRatio",
    "brakeWeight",
    "brakeType",
    "trainCCSystem",
    "trainRadioSystem",
    "trainMaxSpeed",
    "tiltingFunction",
    "maxAxleWeight",
    "numberOfAxles"
})
@XmlRootElement(name = "TrainDataPassenger")
public class TrainDataPassenger {

    @XmlElement(name = "TrainType")
    protected BigInteger trainType;
    @XmlElement(name = "Length")
    protected Length length;
    @XmlElement(name = "TrainWeight")
    protected Integer trainWeight;
    @XmlElement(name = "BrakingRatio")
    protected Integer brakingRatio;
    @XmlElement(name = "BrakeWeight")
    protected Integer brakeWeight;
    @XmlElement(name = "BrakeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brakeType;
    @XmlElement(name = "TrainCC_System")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trainCCSystem;
    @XmlElement(name = "TrainRadioSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trainRadioSystem;
    @XmlElement(name = "TrainMaxSpeed")
    protected Integer trainMaxSpeed;
    @XmlElement(name = "TiltingFunction")
    protected Boolean tiltingFunction;
    @XmlElement(name = "MaxAxleWeight")
    protected BigDecimal maxAxleWeight;
    @XmlElement(name = "NumberOfAxles")
    protected Integer numberOfAxles;

    /**
     * Gets the value of the trainType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainType() {
        return trainType;
    }

    /**
     * Sets the value of the trainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainType(BigInteger value) {
        this.trainType = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setLength(Length value) {
        this.length = value;
    }

    /**
     * Gets the value of the trainWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainWeight() {
        return trainWeight;
    }

    /**
     * Sets the value of the trainWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainWeight(Integer value) {
        this.trainWeight = value;
    }

    /**
     * Gets the value of the brakingRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrakingRatio() {
        return brakingRatio;
    }

    /**
     * Sets the value of the brakingRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrakingRatio(Integer value) {
        this.brakingRatio = value;
    }

    /**
     * Gets the value of the brakeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrakeWeight() {
        return brakeWeight;
    }

    /**
     * Sets the value of the brakeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrakeWeight(Integer value) {
        this.brakeWeight = value;
    }

    /**
     * Gets the value of the brakeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeType() {
        return brakeType;
    }

    /**
     * Sets the value of the brakeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeType(String value) {
        this.brakeType = value;
    }

    /**
     * Gets the value of the trainCCSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCCSystem() {
        return trainCCSystem;
    }

    /**
     * Sets the value of the trainCCSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCCSystem(String value) {
        this.trainCCSystem = value;
    }

    /**
     * Gets the value of the trainRadioSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainRadioSystem() {
        return trainRadioSystem;
    }

    /**
     * Sets the value of the trainRadioSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainRadioSystem(String value) {
        this.trainRadioSystem = value;
    }

    /**
     * Gets the value of the trainMaxSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainMaxSpeed() {
        return trainMaxSpeed;
    }

    /**
     * Sets the value of the trainMaxSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainMaxSpeed(Integer value) {
        this.trainMaxSpeed = value;
    }

    /**
     * Gets the value of the tiltingFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTiltingFunction() {
        return tiltingFunction;
    }

    /**
     * Sets the value of the tiltingFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTiltingFunction(Boolean value) {
        this.tiltingFunction = value;
    }

    /**
     * Gets the value of the maxAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAxleWeight() {
        return maxAxleWeight;
    }

    /**
     * Sets the value of the maxAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAxleWeight(BigDecimal value) {
        this.maxAxleWeight = value;
    }

    /**
     * Gets the value of the numberOfAxles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Sets the value of the numberOfAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAxles(Integer value) {
        this.numberOfAxles = value;
    }

}