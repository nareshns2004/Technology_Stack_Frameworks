package com.example.riley.myFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Bus();
		String mil = vehicle1.getMileage();
		System.out.println(mil);
		
	}

}
