package com.edigestgroup.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class FestivalDiscountImpl implements DiscountService {

	@Override
	public String getDiscountMessage() {
		// TODO Auto-generated method stub
		return "10% Discount";
	}

}
