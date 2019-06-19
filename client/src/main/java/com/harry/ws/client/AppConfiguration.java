package com.harry.ws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author zhouhong
 * @version 1.0
 * @title: AppConfiguration
 * @description: TODO
 * @date 2019/6/19 15:53
 */
@Configuration
public class AppConfiguration {


    @Bean
    public UserClient userClient() {
        return new UserClient();
    }

}
