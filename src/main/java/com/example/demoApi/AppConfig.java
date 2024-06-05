package com.example.demoApi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
@Bean
@ConditionalOnProperty(name="project.mode", havingValue = "production")
public DB getProdData(){

     return new ProdDB();

   }

@Bean
@ConditionalOnProperty(name="project.mode", havingValue = "development")
public DB getDevData(){

     return new DevDB();

   }

}
