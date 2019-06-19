package com.harry.ws.server.common;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author zhouhong
 * @version 1.0
 * @title: CommonService
 * @description: TODO
 * @date 2019/6/19 18:06
 */
@WebService(name = "CommonService", // 暴露服务名称
        targetNamespace = "http://webservice.harry.com/"// 命名空间,一般是接口的包名倒序
)
public interface CommonService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    public String sayHello(@WebParam(name = "userName") String name);

}
