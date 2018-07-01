package com.kevin.springclouduserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringCloudUserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserserviceApplication.class, args);
    }


}
