package com.harry.ws.server.common;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * 接口实现
 *
 * @author leftso
 *
 */
@WebService(serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.harry.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.harry.ws.server.common.CommonService"// 接口地址
)
@Component
public class CommonServiceImp implements CommonService {

    @Override
    public String sayHello(String name) {

        return "Hello ," + name;
    }

}
