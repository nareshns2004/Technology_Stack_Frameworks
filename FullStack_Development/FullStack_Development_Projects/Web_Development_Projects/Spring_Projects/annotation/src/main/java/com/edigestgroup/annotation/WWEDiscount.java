package com.edigestgroup.annotation;

import org.springframework.stereotype.Component;

@Component
public class WWEDiscount implements DiscountService {

	@Override
	public String getDiscoutMessage() {
		// TODO Auto-generated method stub
		return "1% Discount!";
	}

}
