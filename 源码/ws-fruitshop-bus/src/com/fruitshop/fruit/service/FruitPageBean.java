
package com.fruitshop.fruit.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fruitPageBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取count属性的值。
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * 获取currentPage属性的值。
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置currentPage属性的值。
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
     * 获取pageSize属性的值。
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 获取totalPage属性的值。
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 设置totalPage属性的值。
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

}
