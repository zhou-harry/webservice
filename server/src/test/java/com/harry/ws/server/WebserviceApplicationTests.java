package com.harry.ws.server;

import com.harry.ws.server.users.User;
import com.harry.ws.server.users.UserIdRequest;
import com.harry.ws.server.users.UserResponse;
import org.junit.Test;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.time.Instant;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class WebserviceApplicationTests {

    @Test
    public void contextLoads() {

    }

    public static void main(String[] args) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();

        jaxb2Marshaller.setClassesToBeBound(UserIdRequest.class, UserResponse.class, User.class);

        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);

        //构造 SOAP 请求
        UserIdRequest userIdRequest = new UserIdRequest();
        userIdRequest.setUserId(2L);
        userIdRequest.setTimestamp(Instant.now().toEpochMilli());

        SoapActionCallback soapActionCallback = new SoapActionCallback("<the operation name as defined in the WSDL>");

        UserResponse userResponse = (UserResponse) webServiceTemplate.marshalSendAndReceive(
                "http://localhost:8080/web-services/users",
                userIdRequest,
                soapActionCallback
        );
        User user = userResponse.getUser();
        System.out.println(user.getName()+"/"+user.getAge()+"/"+userResponse.getTimestamp());
    }

}
