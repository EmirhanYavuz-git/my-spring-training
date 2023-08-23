package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringIntegerConfig {

    @Bean
    public String str(){
        return "Emirhan";
    }

    @Bean
    public Integer num(){
        return 300;
    }
}
