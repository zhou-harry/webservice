package com.harry.ws.server.webservice.impl;

import com.harry.ws.server.webservice.UserWebService;
import com.harry.ws.server.webservice.entity.UserEntity;
import com.harry.ws.server.webservice.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserWebServiceImpl
 * @description: TODO
 * @date 2019/6/19 17:23
 */
public class UserWebServiceImpl implements UserWebService {

    @Autowired
    private UserEntityRepository repository;

    @Override
    public UserEntity getUser(long id) {
        return repository.findById(id);
    }
}
