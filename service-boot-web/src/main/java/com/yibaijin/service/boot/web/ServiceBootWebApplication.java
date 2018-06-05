package com.yibaijin.service.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.yibaijin")
@ImportResource("classpath*:application-context-*.xml")
public class ServiceBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBootWebApplication.class, args);
    }
}
