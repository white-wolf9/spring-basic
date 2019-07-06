package com.lti.test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CarPart;
import com.lti.interfaces.CarPartsInventory;

public class Test {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

	@org.junit.Test
	public void test() {
		
		CarPartsInventory cpi = (CarPartsInventory) context.getBean("carPartsImpl1");
		
		CarPart carPart = new CarPart();
		carPart.setCarModel("Honda Civic");
		carPart.setPartName("Axle");
		carPart.setPartNo(1);
		carPart.setQuantity(12);
		
		cpi.addNewPart(carPart);
		
	}

}
