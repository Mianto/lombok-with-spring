package com.example.demo.lombokSpringInjection;


import com.example.demo.Engine;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Getter
@RequiredArgsConstructor
public class LombokSpringCar {
    private final Engine engine;
}
