package com.edigestgroup.javaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaconfigApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Vehicle vehicle = context.getBean("car",Vehicle.class);
		System.out.println(vehicle.getMileage());
		System.out.println(vehicle.getDiscountMessage());
		System.out.println(vehicle.getMrp());
	}

}
