//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.10.09 时间 10:49:29 AM CST 
//


package com.harry.ws.client.wsdl.userapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.harry.ws.client.wsdl.userapi package. 
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

    private final static QName _GetUser_QNAME = new QName("http://webservice.harry.com/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://webservice.harry.com/", "getUserResponse");
    private final static QName _SayHello_QNAME = new QName("http://webservice.harry.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://webservice.harry.com/", "sayHelloResponse");
    private final static QName _SettlementUpdate_QNAME = new QName("http://webservice.harry.com/", "settlementUpdate");
    private final static QName _SettlementUpdateResponse_QNAME = new QName("http://webservice.harry.com/", "settlementUpdateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.harry.ws.client.wsdl.userapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SettlementUpdate }
     * 
     */
    public SettlementUpdate createSettlementUpdate() {
        return new SettlementUpdate();
    }

    /**
     * Create an instance of {@link SettlementUpdateResponse }
     * 
     */
    public SettlementUpdateResponse createSettlementUpdateResponse() {
        return new SettlementUpdateResponse();
    }

    /**
     * Create an instance of {@link UserEntity }
     * 
     */
    public UserEntity createUserEntity() {
        return new UserEntity();
    }

    /**
     * Create an instance of {@link SettlementRequest }
     * 
     */
    public SettlementRequest createSettlementRequest() {
        return new SettlementRequest();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link SettlementResponse }
     * 
     */
    public SettlementResponse createSettlementResponse() {
        return new SettlementResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "settlementUpdate")
    public JAXBElement<SettlementUpdate> createSettlementUpdate(SettlementUpdate value) {
        return new JAXBElement<SettlementUpdate>(_SettlementUpdate_QNAME, SettlementUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.harry.com/", name = "settlementUpdateResponse")
    public JAXBElement<SettlementUpdateResponse> createSettlementUpdateResponse(SettlementUpdateResponse value) {
        return new JAXBElement<SettlementUpdateResponse>(_SettlementUpdateResponse_QNAME, SettlementUpdateResponse.class, null, value);
    }

}
