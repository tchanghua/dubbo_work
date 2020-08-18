package com.tch.dubbo.filter.service;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName:ProviderAMain
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/8/18
 * @serviceInterface. TODO 接口名
 * @serviceVersion. 1.0.0
 * @serviceGroup. biz-spc
 */
public class ProviderBMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("providerB is start");
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.tch.dubbo.filter.impl")
    @PropertySource("classpath:/dubbo-provider.properties")
    static class ProviderConfiguration {
        @Bean
        public RegistryConfig registryConfig() {
            RegistryConfig registryConfig = new RegistryConfig();
            registryConfig.setAddress("zookeeper://127.0.0.1:2181?timeout=10000");
            //registryConfig.setTimeout(10000);
            return registryConfig;
        }
    }

}