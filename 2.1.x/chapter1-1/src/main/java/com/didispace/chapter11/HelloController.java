package com.didispace.chapter11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "打开这个界面说明你已经打开了spring boot";
    }

    @RequestMapping("/mytest")
    public String mytest() {
        return "这是我";
    }

}