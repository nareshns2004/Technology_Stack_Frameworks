package com.edigest.first_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle1 = context.getBean("myVehicle",Vehicle.class);
		Vehicle vehicle2 = context.getBean("myVehicle",Vehicle.class);
		System.out.println(vehicle1==vehicle2);

		
	}

}
