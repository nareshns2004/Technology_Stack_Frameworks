package com.example.riley.myFirstProject;

public class Bus implements Vehicle {

	private DiscountService discountService;
	
	@Override
	public String getMileage() {
		return "20 kmpl";
	}
	
	public String getDiscountMessage() {
		
		return this.discountService.getDiscountMessage();
		
	}
	
}
