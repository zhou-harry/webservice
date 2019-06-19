package com.harry.ws.server.webservice.entity;

import java.io.Serializable;

/**
 * @author zhouhong
 * @version 1.0
 * @title: UserEntity
 * @description: TODO
 * @date 2019/6/19 17:21
 */
public class UserEntity implements Serializable {

    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserEntity() {
    }

    public UserEntity(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
