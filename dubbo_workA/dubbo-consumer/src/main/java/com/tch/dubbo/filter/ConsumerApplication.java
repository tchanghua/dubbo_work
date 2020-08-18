package com.tch.dubbo.filter;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName:ConsumerApplication
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/8/18
 */
@EnableDubbo(scanBasePackages = "com.tch.dubbo.filter")
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}