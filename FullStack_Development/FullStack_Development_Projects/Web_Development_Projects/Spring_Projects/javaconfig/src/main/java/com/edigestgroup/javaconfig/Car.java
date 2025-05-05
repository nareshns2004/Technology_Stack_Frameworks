package com.edigestgroup.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Car implements Vehicle {
	//@Autowired
	private DiscountService discountService;
	
	@Value("${car.mrp}")
	private int mrp;
	
	public int getMrp() {
		return mrp;
	}

	public Car(DiscountService discountService) {
		
		this.discountService = discountService;
	}
	
	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "20 kmpl";
	}
	
	@Override
	public String getDiscountMessage()
	{
		return this.discountService.getDiscountMessage();
	}
	
}
