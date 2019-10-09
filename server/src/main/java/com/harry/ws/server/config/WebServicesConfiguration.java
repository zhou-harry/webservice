package com.harry.ws.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @author zhouhong
 * @version 1.0
 * @title: WebServicesConfiguration
 * @description: TODO
 * @date 2019/6/19 11:18
 */
@EnableWs
@Configuration
public class WebServicesConfiguration extends WsConfigurerAdapter {

    @Value("${schema.namespace.uri.harry}")
    private String NAMESPACE_URI;
    @Value("${schema.location.uri.harry}")
    private String LOCATION_URI;

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/web-services/*","/ws/*");
    }

    /**
     * http://localhost:8080/ws/users.wsdl
     * @return
     */
    @Bean("users")
    public Wsdl11Definition userWsdl11Definition(XsdSchema userXsdSchema) {
        DefaultWsdl11Definition userWsdl11Definition = new DefaultWsdl11Definition();

        userWsdl11Definition.setPortTypeName("UserServicePort");
        userWsdl11Definition.setTargetNamespace(NAMESPACE_URI);
//        userWsdl11Definition.setLocationUri(LOCATION_URI);
        userWsdl11Definition.setSchema(userXsdSchema);

        return userWsdl11Definition;
    }


    @Bean
    public XsdSchema userXsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("META-INF/schemas/user.xsd"));
    }

    /**
     * http://localhost:8080/ws/settlement.wsdl
     * @return
     */
    @Bean("settlement")
    public Wsdl11Definition settlementWsdl11Definition(XsdSchema settlementXsdSchema) {
        DefaultWsdl11Definition userWsdl11Definition = new DefaultWsdl11Definition();

        userWsdl11Definition.setPortTypeName("SettlementServicePort");
        userWsdl11Definition.setTargetNamespace(NAMESPACE_URI);
//        userWsdl11Definition.setLocationUri(LOCATION_URI);
        userWsdl11Definition.setSchema(settlementXsdSchema);

        return userWsdl11Definition;
    }


    @Bean
    public XsdSchema settlementXsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("META-INF/schemas/settlement.xsd"));
    }
}
