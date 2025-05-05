package com.edigestgroup.annotation;

import org.springframework.stereotype.Component;

@Component
public class NoDiscountService implements DiscountService {

	@Override
	public String getDiscoutMessage() {
		// TODO Auto-generated method stub
		return "No Discount!";
	}

}
