package com.jhonata.CrudJava.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApiV1() {
        return GroupedOpenApi.builder()
                .group("spring-v1")
                .pathsToMatch("/v1/**")
                .build();
    }
}
