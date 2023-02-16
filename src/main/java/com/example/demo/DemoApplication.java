package com.example.demo;

import com.example.demo.lombokSpringInjection.LombokSpringCar;
import com.example.demo.springConstructor.SpringCar;
import com.example.demo.springField.SpringFieldCar;
import com.example.demo.springSetter.SpringSetterCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("-----Constructor Injection------");
		SpringCar springCar = context.getBean(SpringCar.class);
		System.out.println(springCar.getEngine().getClass());

		System.out.println("-----Setter Injection------");
		SpringSetterCar setterCar = context.getBean(SpringSetterCar.class);
		System.out.println(setterCar.getEngine().getClass());

		System.out.println("-----Field Injection------");
		SpringFieldCar springFieldCar = context.getBean(SpringFieldCar.class);;
		System.out.println(springFieldCar.getSpringFieldEngine().getClass());

		System.out.println("-----Lombok Injection------");
		LombokSpringCar lombokSpringCar = context.getBean(LombokSpringCar.class);;
		System.out.println(lombokSpringCar.getEngine().getClass());


	}
}
