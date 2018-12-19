
package com.fruitshop.order.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfruitID���Ե�ֵ��
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
     * ����fruitID���Ե�ֵ��
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
     * ��ȡorderItemID���Ե�ֵ��
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
     * ����orderItemID���Ե�ֵ��
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
     * ��ȡorderItemQuantity���Ե�ֵ��
     * 
     */
    public int getOrderItemQuantity() {
        return orderItemQuantity;
    }

    /**
     * ����orderItemQuantity���Ե�ֵ��
     * 
     */
    public void setOrderItemQuantity(int value) {
        this.orderItemQuantity = value;
    }

}
