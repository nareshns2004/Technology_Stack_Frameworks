package com.example.riley.myFirstProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle = context.getBean("myVehicle", Vehicle.class);
		System.out.println(vehicle.getMileage());
		System.out.println(vehicle.getDiscountMessage());
	}

}
