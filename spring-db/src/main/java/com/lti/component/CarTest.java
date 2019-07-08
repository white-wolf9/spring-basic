package com.lti.component;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	@Test
	public void add() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CarPartsInventory cp=(CarPartsInventory) context.getBean("carpartsImpl1");
		
		CarPart p=new CarPart();
		p.setPartNo(2);
		p.setPartName("wheel");
		p.setCarModel("Audi Q3");
	    p.setQuantity(8);
	    cp.addNewPart(p);
	}

}
