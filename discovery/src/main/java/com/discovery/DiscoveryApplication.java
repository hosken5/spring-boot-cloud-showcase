package com.discovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'hongpf' at '16-4-14 下午4:40' with Gradle 2.10
 *
 * @author hongpf, @date 16-4-14 下午4:40
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String []  args ){
        SpringApplication.run(DiscoveryApplication.class,args) ;
    }
}