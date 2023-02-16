package com.example.demo;

import com.example.demo.springConstructor.SpringCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringCar springCar = context.getBean(SpringCar.class);
		System.out.println(springCar.getEngine().getClass());
	}
}
