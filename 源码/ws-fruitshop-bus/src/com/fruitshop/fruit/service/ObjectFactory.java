
package com.fruitshop.fruit.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fruitshop.fruit.service package. 
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

    private final static QName _Fruit_QNAME = new QName("http://service.fruit.com/", "Fruit");
    private final static QName _FruitBean_QNAME = new QName("http://service.fruit.com/", "FruitBean");
    private final static QName _FindFruitByID_QNAME = new QName("http://service.fruit.com/", "findFruitByID");
    private final static QName _FindFruitByIDResponse_QNAME = new QName("http://service.fruit.com/", "findFruitByIDResponse");
    private final static QName _FindFruitPage_QNAME = new QName("http://service.fruit.com/", "findFruitPage");
    private final static QName _FindFruitPageResponse_QNAME = new QName("http://service.fruit.com/", "findFruitPageResponse");
    private final static QName _Exception_QNAME = new QName("http://service.fruit.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fruitshop.fruit.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fruit }
     * 
     */
    public Fruit createFruit() {
        return new Fruit();
    }

    /**
     * Create an instance of {@link FruitPageBean }
     * 
     */
    public FruitPageBean createFruitPageBean() {
        return new FruitPageBean();
    }

    /**
     * Create an instance of {@link FindFruitByID }
     * 
     */
    public FindFruitByID createFindFruitByID() {
        return new FindFruitByID();
    }

    /**
     * Create an instance of {@link FindFruitByIDResponse }
     * 
     */
    public FindFruitByIDResponse createFindFruitByIDResponse() {
        return new FindFruitByIDResponse();
    }

    /**
     * Create an instance of {@link FindFruitPage }
     * 
     */
    public FindFruitPage createFindFruitPage() {
        return new FindFruitPage();
    }

    /**
     * Create an instance of {@link FindFruitPageResponse }
     * 
     */
    public FindFruitPageResponse createFindFruitPageResponse() {
        return new FindFruitPageResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fruit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "Fruit")
    public JAXBElement<Fruit> createFruit(Fruit value) {
        return new JAXBElement<Fruit>(_Fruit_QNAME, Fruit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FruitPageBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "FruitBean")
    public JAXBElement<FruitPageBean> createFruitBean(FruitPageBean value) {
        return new JAXBElement<FruitPageBean>(_FruitBean_QNAME, FruitPageBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFruitByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "findFruitByID")
    public JAXBElement<FindFruitByID> createFindFruitByID(FindFruitByID value) {
        return new JAXBElement<FindFruitByID>(_FindFruitByID_QNAME, FindFruitByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFruitByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "findFruitByIDResponse")
    public JAXBElement<FindFruitByIDResponse> createFindFruitByIDResponse(FindFruitByIDResponse value) {
        return new JAXBElement<FindFruitByIDResponse>(_FindFruitByIDResponse_QNAME, FindFruitByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFruitPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "findFruitPage")
    public JAXBElement<FindFruitPage> createFindFruitPage(FindFruitPage value) {
        return new JAXBElement<FindFruitPage>(_FindFruitPage_QNAME, FindFruitPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFruitPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "findFruitPageResponse")
    public JAXBElement<FindFruitPageResponse> createFindFruitPageResponse(FindFruitPageResponse value) {
        return new JAXBElement<FindFruitPageResponse>(_FindFruitPageResponse_QNAME, FindFruitPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
