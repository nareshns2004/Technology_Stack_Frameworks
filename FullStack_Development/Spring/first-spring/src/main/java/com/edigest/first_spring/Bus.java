package com.edigest.first_spring;

public class Bus implements Vehicle {
	
	private DiscountService discountService;
	private String brandName;
	private Double mrp;


	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Bus() {
		
	}
	
	public Bus(DiscountService discountService) {
		this.discountService = discountService;
	}

	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "20 kmpl";
	}

	@Override
	public String getDiscountService() {
		// TODO Auto-generated method stub
		return "Bus : " + this.discountService.getDiscountMessage();
	}

}
