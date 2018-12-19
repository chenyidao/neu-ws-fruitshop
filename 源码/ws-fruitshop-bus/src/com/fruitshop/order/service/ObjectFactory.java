
package com.fruitshop.order.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fruitshop.order.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Order_QNAME = new QName("http://service.order.com/", "Order");
    private final static QName _OrderItem_QNAME = new QName("http://service.order.com/", "OrderItem");
    private final static QName _AddOrder_QNAME = new QName("http://service.order.com/", "addOrder");
    private final static QName _AddOrderResponse_QNAME = new QName("http://service.order.com/", "addOrderResponse");
    private final static QName _FindOrderByUserID_QNAME = new QName("http://service.order.com/", "findOrderByUserID");
    private final static QName _FindOrderByUserIDResponse_QNAME = new QName("http://service.order.com/", "findOrderByUserIDResponse");
    private final static QName _Exception_QNAME = new QName("http://service.order.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fruitshop.order.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link FindOrderByUserID }
     * 
     */
    public FindOrderByUserID createFindOrderByUserID() {
        return new FindOrderByUserID();
    }

    /**
     * Create an instance of {@link FindOrderByUserIDResponse }
     * 
     */
    public FindOrderByUserIDResponse createFindOrderByUserIDResponse() {
        return new FindOrderByUserIDResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "OrderItem")
    public JAXBElement<OrderItem> createOrderItem(OrderItem value) {
        return new JAXBElement<OrderItem>(_OrderItem_QNAME, OrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "addOrder")
    public JAXBElement<AddOrder> createAddOrder(AddOrder value) {
        return new JAXBElement<AddOrder>(_AddOrder_QNAME, AddOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "addOrderResponse")
    public JAXBElement<AddOrderResponse> createAddOrderResponse(AddOrderResponse value) {
        return new JAXBElement<AddOrderResponse>(_AddOrderResponse_QNAME, AddOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderByUserID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "findOrderByUserID")
    public JAXBElement<FindOrderByUserID> createFindOrderByUserID(FindOrderByUserID value) {
        return new JAXBElement<FindOrderByUserID>(_FindOrderByUserID_QNAME, FindOrderByUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderByUserIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "findOrderByUserIDResponse")
    public JAXBElement<FindOrderByUserIDResponse> createFindOrderByUserIDResponse(FindOrderByUserIDResponse value) {
        return new JAXBElement<FindOrderByUserIDResponse>(_FindOrderByUserIDResponse_QNAME, FindOrderByUserIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.order.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
