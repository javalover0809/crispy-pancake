package com.didispace.chapter11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    UserService userService;

    @RequestMapping("/hello")
    public String index() {
        MyUser user=new MyUser(17,"小，明");
        userService.prt(user);
        return user.getName();
    }
    @RequestMapping("/mytest")
    public String mytest() {
        return "这是我";
    }


}