package com.base.controller;


import com.base.service.ConsumerService;
import com.base.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhen on 2017/12/18.
 */
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;
    @Autowired
    LoginService loginService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }

    @GetMapping("/add")
    public String add() {
        return consumerService.add();
    }

    @GetMapping("/sum")
    public String sum() {
        return consumerService.sum();
    }

    @GetMapping("/login")
    public String login() {
        return loginService.login();
    }

    @GetMapping("/logout")
    public String logout() {
        return loginService.logout();
    }

}
