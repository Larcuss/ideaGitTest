package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

//lombok @Data标识bean(getter+setter,不用自己写) @Accessors链式写法 bean.set.set.set(连续) @Repository标识bean.java
//持久层框架mybatis +plus便捷
//+node.js npm=pip cnpm/npm一个项目中只用一个
//v-if

@Controller
public class HelloworldController {
    @Autowired
    User user = new User();

    @RequestMapping("/h")//necessary json-map返回map
    public String hello(String req, Model model)
    {
        Map<String, Object> map = new HashMap<>();
        System.out.println(req);
        model.addAttribute("msg", "thymeleaf here");
        if(req != null)
        {
            char t = req.charAt(0);
            if(t == 'I')    map.put("code", 200);
        }
        else
        {
            map.put("code", -1);
        }
        return "/helloworld";
    }

}
