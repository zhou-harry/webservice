package com.harry.ws.server.webservice.repository;

import com.harry.ws.server.webservice.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserEntityRepository
 * @description: TODO
 * @date 2019/6/19 17:25
 */
@Repository
public class UserEntityRepository {

    private Map<Long, UserEntity> cachedUsers = new HashMap<>();

    @PostConstruct
    public void init() {
        cachedUsers.put(1L, new UserEntity(1L, "harry", 20));
        cachedUsers.put(2L, new UserEntity(2L, "zhouhong", 30));
    }


    public UserEntity findById(long id) {
        return cachedUsers.get(id);
    }

}
