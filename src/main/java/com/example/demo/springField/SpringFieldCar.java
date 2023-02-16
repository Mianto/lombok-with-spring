package com.example.demo.springField;

import com.example.demo.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringFieldCar {
    @Autowired
    private Engine springFieldEngine;

    public Engine getSpringFieldEngine() {
        return springFieldEngine;
    }

    public void setSpringFieldEngine(Engine springFieldEngine) {
        this.springFieldEngine = springFieldEngine;
    }
}
