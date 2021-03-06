
package com.fruit.service2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-05T10:30:53.594+08:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "Exception", targetNamespace = "http://service.fruit.com/")
public class Exception_Exception extends java.lang.Exception {

    private com.fruit.service2.Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.fruit.service2.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.fruit.service2.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.fruit.service2.Exception getFaultInfo() {
        return this.exception;
    }
}
