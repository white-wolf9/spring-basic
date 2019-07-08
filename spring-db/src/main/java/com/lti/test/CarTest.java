package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CarPart;
import com.lti.component.CarPartsInventory;

public class CarTest {

	@Test
	public void add() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CarPartsInventory cp=(CarPartsInventory) context.getBean("carPartsImpl2");
		
		CarPart p=new CarPart();
		p.setPartNo(2);
		p.setPartName("Side Mirror");
		p.setCarModel("Maruti 800");
	    p.setQuantity(2);
	    cp.addNewPart(p);
	}

}
