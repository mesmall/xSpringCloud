package com.base.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by lizhen on 2017/12/19.
 */
@Service
public class LoginService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbacklogin")
    public String login() {
        Date date = new Date();
        String time = date.getMonth()+":"+date.getDate()+":"+date.getDay()+":"+date.getHours()+date.getMinutes();
        System.out.println("login:"+time);
        return restTemplate.getForObject("http://eureka-client/login", String.class);
    }
    public String fallbacklogin() {
        Date date = new Date();
        String time = date.getMonth()+":"+date.getDate()+":"+date.getDay()+":"+date.getHours()+date.getMinutes();
        System.out.println("fallbacklogin:"+time);
        return "fallbacklogin";
    }
    @HystrixCommand(fallbackMethod = "fallbacklogout")
    public String logout() {
        Date date = new Date();
        String time = date.getMonth()+":"+date.getDate()+":"+date.getDay()+":"+date.getHours()+date.getMinutes();
        System.out.println("logout:"+time);
        return restTemplate.getForObject("http://eureka-client/logout", String.class);
    }
    public String fallbacklogout() {
        Date date = new Date();
        String time = date.getMonth()+":"+date.getDate()+":"+date.getDay()+":"+date.getHours()+date.getMinutes();
        System.out.println("fallbacklogout:"+time);
        return "fallbacklogout";
    }

}
