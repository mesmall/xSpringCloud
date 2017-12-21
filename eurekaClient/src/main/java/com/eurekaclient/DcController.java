package com.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhen on 2017/12/18.
 */

@RestController
public class DcController {
    @Value("${server.port}")
    private String port;
    @Autowired
    Environment environment;
    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/dc")
    public String dc() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String str = discoveryClient.description();
        System.out.println("description:"+str);
        String services = "one Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/add")
    public String add() {
        System.out.println("add:"+discoveryClient.description()+":port:"+port);
        String services = "one Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/sum")
    public String sum() {
        String port = environment.getProperty("server.port");
        System.out.println("sum:"+discoveryClient.description()+":port:"+port);
        String services = "one  Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
    @GetMapping("/login")
    public String login() {
        System.out.println("sum:"+discoveryClient.description());
        String services = "one  Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
    @GetMapping("/logout")
    public String logout() {
        System.out.println("sum:"+discoveryClient.description());
        String services = "one  Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
