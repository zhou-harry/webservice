package com.harry.ws.server.webservice;

import com.harry.ws.server.webservice.entity.UserEntity;

import javax.jws.WebService;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserWebService
 * @description: TODO
 * @date 2019/6/19 17:20
 */
@WebService
public interface UserWebService {

    UserEntity getUser(long id);

}
