package com.harry.ws.client;

import com.harry.ws.client.wsdl.UserResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhouhong
 * @version 1.0
 * @title: WSClientApp
 * @description: TODO
 * @date 2019/6/19 15:51
 */
@SpringBootApplication
public class WSClientApp {

    public static void main(String[] args) {
        SpringApplication.run(WSClientApp.class, args);
    }

    @Bean
    CommandLineRunner lookup(UserClient client) {
        return args -> {
            UserResponse response = client.getUser();
            System.out.println("response: " + response.getUser().getName());
        };
    }
}
