package com.edigestgroup.annotation;

import org.springframework.stereotype.Component;

@Component
public class FestivalDiscountImpl implements DiscountService {

	@Override
	public String getDiscoutMessage() {
		// TODO Auto-generated method stub
		return "Please contact sales team!";
	}

}
