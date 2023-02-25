package com.ocihan.weatherapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ocihan.weatherapp.exceptions.RestTemplateError;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    private final RestTemplateError restTemplateError;

    public BeanConfig(RestTemplateError restTemplateError) {
        this.restTemplateError = restTemplateError;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().errorHandler(restTemplateError).build();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
