
package com.fruitshop.fruit.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fruit complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfruitDescription���Ե�ֵ��
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
     * ����fruitDescription���Ե�ֵ��
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
     * ��ȡfruitName���Ե�ֵ��
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
     * ����fruitName���Ե�ֵ��
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
     * ��ȡfruitPrice���Ե�ֵ��
     * 
     */
    public float getFruitPrice() {
        return fruitPrice;
    }

    /**
     * ����fruitPrice���Ե�ֵ��
     * 
     */
    public void setFruitPrice(float value) {
        this.fruitPrice = value;
    }

    /**
     * ��ȡfruitPurchasePrice���Ե�ֵ��
     * 
     */
    public float getFruitPurchasePrice() {
        return fruitPurchasePrice;
    }

    /**
     * ����fruitPurchasePrice���Ե�ֵ��
     * 
     */
    public void setFruitPurchasePrice(float value) {
        this.fruitPurchasePrice = value;
    }

    /**
     * ��ȡfruitReserve���Ե�ֵ��
     * 
     */
    public int getFruitReserve() {
        return fruitReserve;
    }

    /**
     * ����fruitReserve���Ե�ֵ��
     * 
     */
    public void setFruitReserve(int value) {
        this.fruitReserve = value;
    }

}
