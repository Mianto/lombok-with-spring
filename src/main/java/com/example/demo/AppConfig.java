package com.example.demo;

import com.example.demo.springConstructor.SpringCar;
import com.example.demo.springConstructor.SpringV6Engine;
import com.example.demo.springSetter.SpringSetterCar;
import com.example.demo.springSetter.SpringSetterV8Engine;
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

    @Bean
    public Engine springSetterEngine() {
        return new SpringSetterV8Engine();
    }

    @Bean
    public SpringSetterCar springSetterCar() {
        SpringSetterCar setterCar = new SpringSetterCar();
        setterCar.setEngine(springSetterEngine());
        return setterCar;
    }
}
