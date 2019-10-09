package com.harry.ws.server.repository;

import com.harry.ws.server.wsdl.users.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserRepository
 * @description: 用户仓储
 * @date 2019/6/19 11:21
 */
@Repository
public class UserRepository {

    private Map<Long, User> cachedUsers = new HashMap<>();

    @PostConstruct
    public void init() {
        User user = createUser(1, "harry", 32);
        User user2 = createUser(2, "张三", null);
        User user3 = createUser(3, "李四", null);
        cachedUsers.put(1L, user);
        cachedUsers.put(2L, user2);
        cachedUsers.put(3L, user3);
    }


    public User findById(long id) {
        return cachedUsers.get(id);
    }


    private User createUser(long id, String name, Integer age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        return user;
    }

}
