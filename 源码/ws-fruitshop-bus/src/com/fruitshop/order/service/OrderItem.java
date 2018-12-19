
package com.fruitshop.order.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fruitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderItemQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderItem", propOrder = {
    "fruitID",
    "orderID",
    "orderItemID",
    "orderItemQuantity"
})
public class OrderItem {

    protected String fruitID;
    protected String orderID;
    protected String orderItemID;
    protected int orderItemQuantity;

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
     * 获取orderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * 获取orderItemID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * 设置orderItemID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * 获取orderItemQuantity属性的值。
     * 
     */
    public int getOrderItemQuantity() {
        return orderItemQuantity;
    }

    /**
     * 设置orderItemQuantity属性的值。
     * 
     */
    public void setOrderItemQuantity(int value) {
        this.orderItemQuantity = value;
    }

}
