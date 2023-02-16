package com.example.demo.springConstructor;

import com.example.demo.Engine;
import org.springframework.stereotype.Component;

@Component
public class SpringCar {
    private Engine engine;

    public SpringCar(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
