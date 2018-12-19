
package com.fruitshop.user.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fruitshop.user.service package. 
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

    private final static QName _User_QNAME = new QName("http://service.user.com/", "User");
    private final static QName _Login_QNAME = new QName("http://service.user.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://service.user.com/", "loginResponse");
    private final static QName _Regist_QNAME = new QName("http://service.user.com/", "regist");
    private final static QName _RegistResponse_QNAME = new QName("http://service.user.com/", "registResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fruitshop.user.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Regist }
     * 
     */
    public Regist createRegist() {
        return new Regist();
    }

    /**
     * Create an instance of {@link RegistResponse }
     * 
     */
    public RegistResponse createRegistResponse() {
        return new RegistResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.com/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Regist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.com/", name = "regist")
    public JAXBElement<Regist> createRegist(Regist value) {
        return new JAXBElement<Regist>(_Regist_QNAME, Regist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.com/", name = "registResponse")
    public JAXBElement<RegistResponse> createRegistResponse(RegistResponse value) {
        return new JAXBElement<RegistResponse>(_RegistResponse_QNAME, RegistResponse.class, null, value);
    }

}
