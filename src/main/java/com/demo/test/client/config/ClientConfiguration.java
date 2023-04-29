package com.demo.test.client.config;

import feign.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class ClientConfiguration {

    @Value("${api.id}")
    private String apiId;

    @Value("${api.key}")
    private String apiKey;

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthenticationInterceptor basicAuthInterceptor() {
        return new BasicAuthenticationInterceptor(apiId, apiKey);
    }
}
