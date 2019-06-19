package com.harry.ws.client;

import com.harry.ws.client.wsdl.UserIdRequest;
import com.harry.ws.client.wsdl.UserResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.time.Instant;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserClient
 * @description: TODO
 * @date 2019/6/19 15:56
 */
public class UserClient extends WebServiceGatewaySupport {

    public static final String URI = "http://localhost:8080/web-services";
    public static final String SOAPACTION = "http://harry.org/ws/schema/UserIdRequest";
    public static final String CONTEXTPATH = "com.harry.ws.client.wsdl";

    public UserClient() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(CONTEXTPATH);

        this.setDefaultUri(URI);

        this.setMarshaller(marshaller);
        this.setUnmarshaller(marshaller);
    }

    public UserResponse getUser() {

        //构造 SOAP 请求
        UserIdRequest request = new UserIdRequest();
        request.setUserId(2L);
        request.setTimestamp(Instant.now().toEpochMilli());

        UserResponse response = (UserResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request,
                new SoapActionCallback(SOAPACTION));

        return response;
    }

}
