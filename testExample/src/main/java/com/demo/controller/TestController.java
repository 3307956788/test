package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/get")
    public String get(){
        Random r = new Random();
        int i = r.nextInt(10);
        System.out.println("获得的随机数为："+i);
        return "返回随机数："+i;
    }
    
    @RequestMapping("/say")
    public String say(){
        return "说一些莫名其妙的话,让人无法理解";
    }
}
