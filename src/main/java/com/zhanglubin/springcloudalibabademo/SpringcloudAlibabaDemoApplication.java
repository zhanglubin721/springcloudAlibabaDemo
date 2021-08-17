package com.zhanglubin.springcloudalibabademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaDemoApplication.class, args);
    }

}
