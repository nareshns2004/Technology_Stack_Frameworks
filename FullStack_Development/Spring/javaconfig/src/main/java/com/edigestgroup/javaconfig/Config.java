package com.edigestgroup.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.edigestgroup.javaconfig")
@PropertySource("application.properties")
public class Config {
	
	@Bean
	public Vehicle car() {
		
		Car car = new Car(FestivalDiscountImpl());
		return car;
	}
	
	@Bean
	public DiscountService FestivalDiscountImpl() {
		FestivalDiscountImpl festivalDiscount = new FestivalDiscountImpl();
		
		return festivalDiscount;
	}
}
