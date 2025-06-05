package com.example.riley.myFirstProject;

public class Car implements Vehicle {
	
	private DiscountService discountService;
	
	@Override
	public String getMileage() {
		return "30 kmpl";
	}
	
	public String getDiscountMessage() {
		
		return this.discountService.getDiscountMessage();
	}
	
}
