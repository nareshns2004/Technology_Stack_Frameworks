package com.edigestgroup.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoForAnnotationsApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle bean = context.getBean("car",Vehicle.class);
		Vehicle bean1 = context.getBean("car",Vehicle.class);
		
		System.out.println(bean==bean1);
		System.out.println(bean.getMileage());
		System.out.println(bean.getDiscountMessage());
		System.out.println(bean.getMrp());
	}

}
