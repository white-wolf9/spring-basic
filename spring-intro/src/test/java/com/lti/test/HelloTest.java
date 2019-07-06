package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.DummyCalculator;
import com.lti.component.HelloWorld;

public class HelloTest {

	public static void main(String[] args) {
		//Loading Spring's IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld hw = (HelloWorld) context.getBean("hellowworld");		//bean id
		System.out.println(hw.sayHello(" wolfie_boii"));
		
		DummyCalculator dc = (DummyCalculator) context.getBean("doAdd");
		int x = dc.doAdd(2, 4);
		int y = dc.doSubstract(2,6);
		System.out.println(x);
		System.out.println(y);
	}
}

