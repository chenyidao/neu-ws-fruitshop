
package com.fruit.service2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fruit.service2 package. 
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

    private final static QName _UpdateReserve_QNAME = new QName("http://service.fruit.com/", "updateReserve");
    private final static QName _UpdateReserveResponse_QNAME = new QName("http://service.fruit.com/", "updateReserveResponse");
    private final static QName _Exception_QNAME = new QName("http://service.fruit.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fruit.service2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateReserve }
     * 
     */
    public UpdateReserve createUpdateReserve() {
        return new UpdateReserve();
    }

    /**
     * Create an instance of {@link UpdateReserveResponse }
     * 
     */
    public UpdateReserveResponse createUpdateReserveResponse() {
        return new UpdateReserveResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UpdateEntry }
     * 
     */
    public UpdateEntry createUpdateEntry() {
        return new UpdateEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReserve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "updateReserve")
    public JAXBElement<UpdateReserve> createUpdateReserve(UpdateReserve value) {
        return new JAXBElement<UpdateReserve>(_UpdateReserve_QNAME, UpdateReserve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReserveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.fruit.com/", name = "updateReserveResponse")
    public JAXBElement<UpdateReserveResponse> createUpdateReserveResponse(UpdateReserveResponse value) {
        return new JAXBElement<UpdateReserveResponse>(_UpdateReserveResponse_QNAME, UpdateReserveResponse.class, null, value);
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
