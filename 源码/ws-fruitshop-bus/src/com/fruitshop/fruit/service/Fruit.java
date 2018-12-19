
package com.fruitshop.fruit.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fruit complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fruit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fruitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fruitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fruitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fruitPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="fruitPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="fruitReserve" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fruit", propOrder = {
    "fruitDescription",
    "fruitID",
    "fruitName",
    "fruitPrice",
    "fruitPurchasePrice",
    "fruitReserve"
})
public class Fruit {

    protected String fruitDescription;
    protected String fruitID;
    protected String fruitName;
    protected float fruitPrice;
    protected float fruitPurchasePrice;
    protected int fruitReserve;

    /**
     * 获取fruitDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruitDescription() {
        return fruitDescription;
    }

    /**
     * 设置fruitDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruitDescription(String value) {
        this.fruitDescription = value;
    }

    /**
     * 获取fruitID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruitID() {
        return fruitID;
    }

    /**
     * 设置fruitID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruitID(String value) {
        this.fruitID = value;
    }

    /**
     * 获取fruitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * 设置fruitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruitName(String value) {
        this.fruitName = value;
    }

    /**
     * 获取fruitPrice属性的值。
     * 
     */
    public float getFruitPrice() {
        return fruitPrice;
    }

    /**
     * 设置fruitPrice属性的值。
     * 
     */
    public void setFruitPrice(float value) {
        this.fruitPrice = value;
    }

    /**
     * 获取fruitPurchasePrice属性的值。
     * 
     */
    public float getFruitPurchasePrice() {
        return fruitPurchasePrice;
    }

    /**
     * 设置fruitPurchasePrice属性的值。
     * 
     */
    public void setFruitPurchasePrice(float value) {
        this.fruitPurchasePrice = value;
    }

    /**
     * 获取fruitReserve属性的值。
     * 
     */
    public int getFruitReserve() {
        return fruitReserve;
    }

    /**
     * 设置fruitReserve属性的值。
     * 
     */
    public void setFruitReserve(int value) {
        this.fruitReserve = value;
    }

}
