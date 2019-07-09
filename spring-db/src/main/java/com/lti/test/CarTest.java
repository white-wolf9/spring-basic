package com.lti.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.*;

public class CarTest {

	@Test
	public void add() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CarPartsInventory cp=(CarPartsInventory) context.getBean("carPartsImpl4");
		
		CarPart carPart =new CarPart();
		carPart.setCarModel("USi Zaaz");
		carPart.setPartName("Steering Wheel");
		carPart.setPartNo(12);
		carPart.setQuantity(1);
		cp.addNewPart(carPart);
		
		/*List<CarPart> list = cp.getAvailableparts();
		for(CarPart cpi:list) {
			System.out.println(cpi.getPartName());
			System.out.println(cpi.getCarModel());
		} 
		* Using carPartsImpl3
		*/
	}

}
