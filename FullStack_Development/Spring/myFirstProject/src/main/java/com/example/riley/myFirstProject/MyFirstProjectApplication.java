package com.example.riley.myFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		String mileage = vehicle.getMileage();
		System.out.println(mileage);
		
	}

}
