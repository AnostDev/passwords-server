package com.keygen.keygen.test;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld HelloWorldConfig(){
        return new HelloWorld();
    }
}
