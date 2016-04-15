package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongpf on 16/4/15.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SomeApplication {
    @Value("${my.message}")
    private String message ;

    @RequestMapping(value = "/getsome")
    public String getsome (){
        return  message ;
    }

    public static void main(String []  args ){
        SpringApplication.run(SomeApplication.class,args);
    }
}
