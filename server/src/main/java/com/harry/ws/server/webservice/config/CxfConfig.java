package com.harry.ws.server.webservice.config;

import com.harry.ws.server.webservice.UserWebService;
import com.harry.ws.server.webservice.impl.UserWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
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

    /**
     * 通过访问：http://localhost:8080/soap/查看webservice清单
     * @return
     */
    @Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/soap/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Autowired
    UserWebService userWebService;

    @Bean("userApi")
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userWebService);
        endpoint.publish("/user-api");
        return endpoint;
    }
}
