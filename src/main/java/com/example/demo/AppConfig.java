package com.example.demo;

import com.example.demo.springConstructor.SpringCar;
import com.example.demo.springConstructor.SpringV6Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SpringCar springCar() {
        return new SpringCar(engine());
    }

    @Bean Engine engine() {
        return new SpringV6Engine();
    }
}
