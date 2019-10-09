package com.harry.ws.server.webservice.impl;

import com.harry.ws.server.webservice.UserWebService;
import com.harry.ws.server.webservice.entity.*;
import com.harry.ws.server.webservice.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserWebServiceImpl
 * @description: TODO
 * @date 2019/6/19 17:23
 */
@WebService(serviceName = "UserService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.harry.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.harry.ws.server.webservice.UserWebService"// 接口地址
)
@Component
public class UserWebServiceImpl implements UserWebService {

    @Autowired
    private UserEntityRepository repository;

    @Override
    public UserEntity getUser(long id) {
        return repository.findById(id);
    }

    @Override
    public String sayHello(String name) {
        return "Hello ：" + name;
    }

    @Override
    public SettlementResponse settlementUpdate(SettlementRequest request) {
        SettlementResponse response = new SettlementResponse();
        response.setBatchNo(request.getBatchNo());

        List<OrderResponse> orders=new ArrayList<>();
        List<OrderRequest> requestOrders = request.getOrders();
        if (null!=requestOrders){
            requestOrders.forEach(o->{
                orders.add(new OrderResponse(o.getFasOrderNo()));
            });
        }

        response.setOrderDetails(orders);
        return response;
    }
}
