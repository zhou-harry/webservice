package com.harry.ws.client.controller;

import com.harry.ws.client.UserClient;
import com.harry.ws.client.wsdl.UserResponse;
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

}
