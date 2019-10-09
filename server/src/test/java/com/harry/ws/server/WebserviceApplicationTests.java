package com.harry.ws.server;

import com.harry.ws.server.wsdl.settlement.OrderRequest;
import com.harry.ws.server.wsdl.settlement.OrderResponse;
import com.harry.ws.server.wsdl.settlement.SettlementRequest;
import com.harry.ws.server.wsdl.settlement.SettlementResponse;
import com.harry.ws.server.wsdl.users.User;
import com.harry.ws.server.wsdl.users.UserIdRequest;
import com.harry.ws.server.wsdl.users.UserResponse;
import org.junit.Test;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.time.Instant;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class WebserviceApplicationTests {

    @Test
    public void contextLoads() {

    }

    public static void main(String[] args) {
        settlementTest();
    }

    public static void userTest() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();

        jaxb2Marshaller.setClassesToBeBound(UserIdRequest.class, UserResponse.class, User.class);

        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);

        //构造 SOAP 请求
        UserIdRequest userIdRequest = new UserIdRequest();
        userIdRequest.setUserId(1L);
        userIdRequest.setTimestamp(Instant.now().toEpochMilli());

        SoapActionCallback soapActionCallback = new SoapActionCallback("<the operation name as defined in the WSDL>");

        UserResponse userResponse = (UserResponse) webServiceTemplate.marshalSendAndReceive(
                "http://localhost:8080/web-services/",
                userIdRequest,
                soapActionCallback
        );
        User user = userResponse.getUser();
        System.out.println(user.getName() + "/" + user.getAge() + "/" + userResponse.getTimestamp());
    }

    public static void settlementTest() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();

        jaxb2Marshaller.setClassesToBeBound(
                SettlementRequest.class,
                SettlementResponse.class,
                OrderRequest.class,
                OrderResponse.class);

        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);

        //构造 SOAP 请求
        SettlementRequest request = new SettlementRequest();
        request.setBatchNo("B-FAS20191008000000173");
        List<OrderRequest> orders = request.getOrders();
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setFasOrderNo("O-FAS20191008000000224");
        orders.add(orderRequest);

        SoapActionCallback soapActionCallback = new SoapActionCallback("<the operation name as defined in the WSDL>");

        SettlementResponse response = (SettlementResponse) webServiceTemplate.marshalSendAndReceive(
                "http://localhost:8080/web-services/",
                request,
                soapActionCallback
        );
        System.out.println("批次号：" + response.getBatchNo());
        List<OrderResponse> list = response.getOrderDetails();
        list.forEach(o -> {
            System.out.println(o.getFasOrderNo() + "/" + o.getStatus() + "/" + o.getErrorMsg());
        });

    }

}
