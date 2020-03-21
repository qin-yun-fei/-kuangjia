package com.q.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController 的意思就是 controller 里面的方法都以 json 格式输出
public class HellController {

    @RequestMapping("/hello")
    public String index() {

        return "Hello World";
    }

}