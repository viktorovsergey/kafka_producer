package ru.javabegin.micro.demo.producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public PruducerFactory<String,Object>pruducerFactory(){

        Map<String,Object> prop = new HashMap<>();
        return null;
    }
}
