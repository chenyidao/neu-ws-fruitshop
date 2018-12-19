
package com.fruitshop.order.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>order complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorderDeliveryAddress���Ե�ֵ��
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
     * ����orderDeliveryAddress���Ե�ֵ��
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
     * ��ȡorderDeliveryName���Ե�ֵ��
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
     * ����orderDeliveryName���Ե�ֵ��
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
     * ��ȡorderDeliveryPhoneNumber���Ե�ֵ��
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
     * ����orderDeliveryPhoneNumber���Ե�ֵ��
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
     * ��ȡorderDeliveryTime���Ե�ֵ��
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
     * ����orderDeliveryTime���Ե�ֵ��
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
     * ��ȡorderID���Ե�ֵ��
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
     * ����orderID���Ե�ֵ��
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
     * ��ȡorderMoney���Ե�ֵ��
     * 
     */
    public float getOrderMoney() {
        return orderMoney;
    }

    /**
     * ����orderMoney���Ե�ֵ��
     * 
     */
    public void setOrderMoney(float value) {
        this.orderMoney = value;
    }

    /**
     * ��ȡorderPayState���Ե�ֵ��
     * 
     */
    public int getOrderPayState() {
        return orderPayState;
    }

    /**
     * ����orderPayState���Ե�ֵ��
     * 
     */
    public void setOrderPayState(int value) {
        this.orderPayState = value;
    }

    /**
     * ��ȡorderTime���Ե�ֵ��
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
     * ����orderTime���Ե�ֵ��
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
     * ��ȡuserID���Ե�ֵ��
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
     * ����userID���Ե�ֵ��
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
