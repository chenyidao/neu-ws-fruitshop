
package com.fruitshop.order.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>order complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderDeliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDeliveryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDeliveryPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderItems" type="{http://service.order.com/}orderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orderMoney" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="orderPayState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "orderDeliveryAddress",
    "orderDeliveryName",
    "orderDeliveryPhoneNumber",
    "orderDeliveryTime",
    "orderID",
    "orderItems",
    "orderMoney",
    "orderPayState",
    "orderTime",
    "userID"
})
public class Order {

    protected String orderDeliveryAddress;
    protected String orderDeliveryName;
    protected String orderDeliveryPhoneNumber;
    protected String orderDeliveryTime;
    protected String orderID;
    @XmlElement(nillable = true)
    protected List<OrderItem> orderItems;
    protected float orderMoney;
    protected int orderPayState;
    protected String orderTime;
    protected String userID;

    /**
     * 获取orderDeliveryAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDeliveryAddress() {
        return orderDeliveryAddress;
    }

    /**
     * 设置orderDeliveryAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDeliveryAddress(String value) {
        this.orderDeliveryAddress = value;
    }

    /**
     * 获取orderDeliveryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDeliveryName() {
        return orderDeliveryName;
    }

    /**
     * 设置orderDeliveryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDeliveryName(String value) {
        this.orderDeliveryName = value;
    }

    /**
     * 获取orderDeliveryPhoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDeliveryPhoneNumber() {
        return orderDeliveryPhoneNumber;
    }

    /**
     * 设置orderDeliveryPhoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDeliveryPhoneNumber(String value) {
        this.orderDeliveryPhoneNumber = value;
    }

    /**
     * 获取orderDeliveryTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    /**
     * 设置orderDeliveryTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDeliveryTime(String value) {
        this.orderDeliveryTime = value;
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
     * Gets the value of the orderItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItem }
     * 
     * 
     */
    public List<OrderItem> getOrderItems() {
        if (orderItems == null) {
            orderItems = new ArrayList<OrderItem>();
        }
        return this.orderItems;
    }

    /**
     * 获取orderMoney属性的值。
     * 
     */
    public float getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置orderMoney属性的值。
     * 
     */
    public void setOrderMoney(float value) {
        this.orderMoney = value;
    }

    /**
     * 获取orderPayState属性的值。
     * 
     */
    public int getOrderPayState() {
        return orderPayState;
    }

    /**
     * 设置orderPayState属性的值。
     * 
     */
    public void setOrderPayState(int value) {
        this.orderPayState = value;
    }

    /**
     * 获取orderTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * 设置orderTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTime(String value) {
        this.orderTime = value;
    }

    /**
     * 获取userID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
