package com.example.cdc.consumer.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private static final String COURSES_USERNAME = "coursesinfoapi";
    private static final String COURSES_PASSWORD = "tester11";

    @Bean(name = "coursesRestClient")
    public RestTemplate getCoursesRestClient() {
        RestTemplate template = new RestTemplateBuilder().build();
        template.getInterceptors().add(
                new BasicAuthorizationInterceptor(COURSES_USERNAME, COURSES_PASSWORD));

        return template;
    }


}
