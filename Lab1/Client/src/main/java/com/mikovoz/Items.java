
package com.mikovoz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for items complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="items">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellersBySellersId" type="{http://mikovoz.com/}sellers" minOccurs="0"/>
 *         &lt;element name="sellersId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "items", propOrder = {
    "id",
    "name",
    "sellersBySellersId",
    "sellersId"
})
public class Items {

    protected Long id;
    protected String name;
    protected Sellers sellersBySellersId;
    protected Long sellersId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sellersBySellersId property.
     * 
     * @return
     *     possible object is
     *     {@link Sellers }
     *     
     */
    public Sellers getSellersBySellersId() {
        return sellersBySellersId;
    }

    /**
     * Sets the value of the sellersBySellersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sellers }
     *     
     */
    public void setSellersBySellersId(Sellers value) {
        this.sellersBySellersId = value;
    }

    /**
     * Gets the value of the sellersId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellersId() {
        return sellersId;
    }

    /**
     * Sets the value of the sellersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellersId(Long value) {
        this.sellersId = value;
    }

}
