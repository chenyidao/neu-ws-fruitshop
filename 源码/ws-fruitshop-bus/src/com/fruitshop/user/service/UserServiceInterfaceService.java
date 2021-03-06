package com.fruitshop.user.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-03T09:57:11.667+08:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "UserServiceInterfaceService",
                  wsdlLocation = "http://127.0.0.1:8081/ws-fruitshop-user/ws/user?wsdl",
                  targetNamespace = "http://service.user.com/")
public class UserServiceInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.user.com/", "UserServiceInterfaceService");
    public final static QName UserServiceInterfacePort = new QName("http://service.user.com/", "UserServiceInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8081/ws-fruitshop-user/ws/user?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserServiceInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8081/ws-fruitshop-user/ws/user?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserServiceInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserServiceInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UserServiceInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserServiceInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserServiceInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UserServiceInterface
     */
    @WebEndpoint(name = "UserServiceInterfacePort")
    public UserServiceInterface getUserServiceInterfacePort() {
        return super.getPort(UserServiceInterfacePort, UserServiceInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceInterface
     */
    @WebEndpoint(name = "UserServiceInterfacePort")
    public UserServiceInterface getUserServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(UserServiceInterfacePort, UserServiceInterface.class, features);
    }

}
