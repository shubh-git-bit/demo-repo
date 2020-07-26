package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {

    @RequestMapping("/demo")
    @GetMapping(path = "/get")
    User get(){
        User user = new User();
        user.getId();
        return user;
    }
}
