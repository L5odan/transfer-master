
package com.capgemini.transfer.ws.client;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket",
    "data",
    "supplementalData"
})
@XmlRootElement(name = "PostNewhireRecordWithSupplementalData")
public class PostNewhireRecordWithSupplementalData {

    @XmlElement(name = "Ticket")
    protected String ticket;
    protected String data;
    protected String supplementalData;

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the supplementalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementalData() {
        return supplementalData;
    }

    /**
     * Sets the value of the supplementalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalData(String value) {
        this.supplementalData = value;
    }

}
