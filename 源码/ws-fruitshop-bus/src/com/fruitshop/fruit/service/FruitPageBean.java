
package com.fruitshop.fruit.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fruitPageBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="fruitPageBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fruits" type="{http://service.fruit.com/}fruit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fruitPageBean", propOrder = {
    "count",
    "currentPage",
    "fruits",
    "pageSize",
    "totalPage"
})
public class FruitPageBean {

    protected int count;
    protected int currentPage;
    @XmlElement(nillable = true)
    protected List<Fruit> fruits;
    protected int pageSize;
    protected int totalPage;

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * ��ȡcurrentPage���Ե�ֵ��
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * ����currentPage���Ե�ֵ��
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the fruits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fruits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFruits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fruit }
     * 
     * 
     */
    public List<Fruit> getFruits() {
        if (fruits == null) {
            fruits = new ArrayList<Fruit>();
        }
        return this.fruits;
    }

    /**
     * ��ȡpageSize���Ե�ֵ��
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * ����pageSize���Ե�ֵ��
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * ��ȡtotalPage���Ե�ֵ��
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * ����totalPage���Ե�ֵ��
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

}
