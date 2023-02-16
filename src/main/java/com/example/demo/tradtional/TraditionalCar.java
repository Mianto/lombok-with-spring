package com.example.demo.tradtional;

import com.example.demo.Engine;

public class TraditionalCar {
    private Engine engine;

    public TraditionalCar(Engine engine) {
        this.engine = new Engine.V6Engine();
    }
}
