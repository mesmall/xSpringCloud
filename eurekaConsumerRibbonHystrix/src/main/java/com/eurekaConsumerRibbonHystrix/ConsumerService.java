package com.eurekaConsumerRibbonHystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by lizhen on 2017/12/19.
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        System.out.println("consumer:"+new Date().getDate());
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
    public String fallback() {
        System.out.println("fallback:"+new Date().getDate());
        return "fallback";
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public String add() {
        System.out.println("add:"+new Date().getDate());
        return restTemplate.getForObject("http://eureka-client/add", String.class);
    }
    @HystrixCommand(fallbackMethod = "fallback")
    public String sum() {
        System.out.println("sum:"+new Date().getDate());
        return restTemplate.getForObject("http://eureka-client/sum", String.class);
    }
}
