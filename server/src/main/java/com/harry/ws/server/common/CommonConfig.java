package com.harry.ws.server.common;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouhong
 * @version 1.0
 * @title: CommonConfig
 * @description: TODO
 * @date 2019/6/19 18:08
 */
@Configuration
public class CommonConfig {

    @Autowired
    private Bus bus;

    @Autowired
    CommonService commonService;

    /** JAX-WS **/
    @Bean("CommonService")
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, commonService);
        endpoint.publish("/CommonService");
        return endpoint;
    }

}
