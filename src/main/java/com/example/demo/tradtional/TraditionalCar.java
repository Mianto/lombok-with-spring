package com.example.demo.tradtional;

import com.example.demo.Engine;
import com.example.demo.V6Engine;

public class TraditionalCar {
    private Engine engine;

    public TraditionalCar(Engine engine) {
        this.engine = new V6Engine();
    }
}
