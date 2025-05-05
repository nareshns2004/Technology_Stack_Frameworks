package com.edigestgroup.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {
	
	private DiscountService discountService;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("noDiscountService") private DiscountService discountService;
	 */
	
	
	 public DiscountService getDiscountService() { return discountService; }
	 
	 @Value("${car.mrp}")
	 private int mrp;
	 
	 public int getMrp() {
		return mrp;
	}


	@Autowired 
	 @Qualifier("WWEDiscount") 
	 public void setDiscountService( DiscountService discountService) {
	 this.discountService = discountService; }
	 

	/*
	 * @Autowired public Car(DiscountService discountService){ this.discountService
	 * = discountService; }
	 */
	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "20 kmpl";
	}
	
	@Override
	public String getDiscountMessage() {
		return this.discountService.getDiscoutMessage();
	}



}
