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

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/web-services/*","/ws/*");
    }

    @Bean("users")
    public Wsdl11Definition userWsdl11Definition(XsdSchema userXsdSchema) {
        DefaultWsdl11Definition userWsdl11Definition = new DefaultWsdl11Definition();

        userWsdl11Definition.setPortTypeName("UserServicePort");
        userWsdl11Definition.setLocationUri("/web-services");
        userWsdl11Definition.setTargetNamespace(NAMESPACE_URI);
        userWsdl11Definition.setSchema(userXsdSchema);

        return userWsdl11Definition;
    }


    @Bean
    public XsdSchema userXsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("META-INF/schemas/user.xsd"));
    }
}
