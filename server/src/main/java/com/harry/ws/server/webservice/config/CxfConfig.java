package com.harry.ws.server.webservice.config;

import com.harry.ws.server.webservice.UserWebService;
import com.harry.ws.server.webservice.impl.UserWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author zhouhong
 * @version 1.0
 * @title: CxfConfig
 * @description: TODO
 * @date 2019/6/19 17:28
 */
@Configuration
public class CxfConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public UserWebService userWebService(){
        return new UserWebServiceImpl();
    }

    @Bean("api")
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userWebService());
        endpoint.publish("/api");
        return endpoint;
    }
}
