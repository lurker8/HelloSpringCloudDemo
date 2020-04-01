package com.funtl.hello.spring.cloud.web.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced //轮询注解
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
