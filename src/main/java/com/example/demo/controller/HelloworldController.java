package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//lombok @Data标识bean(getter+setter,不用自己写) @Accessors链式写法 bean.set.set.set(连续) @Repository标识bean.java
//持久层框架mybatis +plus便捷
//
@Controller
public class HelloworldController {
    @Autowired
    User user = new User();

    @ResponseBody
    @RequestMapping("/h")//necessary json-map返回map
    public User hello(User u)
    {
        user.setName(u.getName());
        user.setAge(u.getAge());
        return user;
    }

}
