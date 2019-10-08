package com.harry.ws.server.webservice;

import com.harry.ws.server.webservice.entity.UserEntity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserWebService
 * @description: TODO
 * @date 2019/6/19 17:20
 */
@WebService(name = "UserService", // 暴露服务名称
        targetNamespace = "http://webservice.harry.com/"// 命名空间,一般是接口的包名倒序
)
public interface UserWebService {

    UserEntity getUser(long id);

    @WebMethod
    @WebResult(name = "String")
    String sayHello(@WebParam(name = "userName") String name);

}
