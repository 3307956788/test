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
}
