package com.harry.ws.client.controller;

import com.harry.ws.client.UserClient;
import com.harry.ws.client.wsdl.UserResponse;
import com.harry.ws.client.wsdl.userapi.UserEntity;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserController
 * @description: TODO
 * @date 2019/6/19 16:37
 */
@RestController
public class UserController {

    @Autowired
    UserClient userClient;

    @GetMapping("/info")
    public String getUser() {
        UserResponse response = userClient.getUser();
        System.out.println("response: " + response.getUser().getName());
        return response.getUser().getName();
    }

    @GetMapping("/sayHello")
    public String sayHello() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8080/soap/user-api?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects=client.invoke("sayHello","harry");
        //输出调用结果
        System.out.println("======"+objects[0].toString());
        return objects[0].toString();
    }

    @GetMapping("/getUser")
    public String getUserBuId() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8080/soap/user-api?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects=client.invoke("getUser",1l);
        UserEntity user=(UserEntity)objects[0];
        //输出调用结果
        System.out.println("======"+user.toString());
        return user.toString();
    }

}
