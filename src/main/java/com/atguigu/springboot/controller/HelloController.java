package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好<h1/>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu","liuqi"));
        return "success";
    }
}
