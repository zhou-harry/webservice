package com.harry.ws.server.endpoint;

import com.harry.ws.server.repository.UserRepository;
import com.harry.ws.server.wsdl.settlement.OrderRequest;
import com.harry.ws.server.wsdl.settlement.OrderResponse;
import com.harry.ws.server.wsdl.settlement.SettlementRequest;
import com.harry.ws.server.wsdl.settlement.SettlementResponse;
import com.harry.ws.server.wsdl.users.User;
import com.harry.ws.server.wsdl.users.UserIdRequest;
import com.harry.ws.server.wsdl.users.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserServiceEnpoint
 * @description: 用户服务Endpoint
 * @date 2019/6/19 11:20
 */
@Endpoint
public class UserServiceEnpoint {

    private static final String NAMESPACE_URI = "http://harry.org/ws/schema";

    @Autowired
    private UserRepository userRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UserIdRequest")
    @ResponsePayload
    public UserResponse getUser(@RequestPayload UserIdRequest userIdRequest) {

        long userId = userIdRequest.getUserId();

        Instant instant = Instant.ofEpochMilli(userIdRequest.getTimestamp());
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());

        System.out.println("Web Services 用户 ID :" + userId + " , 请求的时间 : " + zonedDateTime);

        User user = userRepository.findById(userId);

        UserResponse userResponse = new UserResponse();

        userResponse.setUser(user);
        userResponse.setTimestamp(Instant.now().toEpochMilli());

        return userResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "settlementRequest")
    @ResponsePayload
    public SettlementResponse settlement(@RequestPayload SettlementRequest request) {
        System.out.println("Web Services 批次号 :" + request.getBatchNo());
        SettlementResponse response = new SettlementResponse();
        response.setBatchNo(request.getBatchNo());

        List<OrderResponse> orders=response.getOrderDetails();
        List<OrderRequest> requestOrders = request.getOrders();
        if (null!=requestOrders){
            requestOrders.forEach(o->{
                OrderResponse orderResponse = new OrderResponse();
                orderResponse.setFasOrderNo(o.getFasOrderNo());
                orderResponse.setStatus("success");
                orderResponse.setErrorMsg("操作成功");
                orders.add(orderResponse);
            });
        }
        return response;
    }

}
