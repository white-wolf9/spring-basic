package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Calculator;
import com.lti.component.CurrencyConverter;
import com.lti.component.DummyCalculator;
import com.lti.component.HelloWorld;

public class HelloTest {

	public static void main(String[] args) {
		//Loading Spring's IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld hw = (HelloWorld) context.getBean("hellowworld");		//bean id
		System.out.println(hw.sayHello(" wolfie_boii"));
		
		DummyCalculator dc = (DummyCalculator) context.getBean("doAdd");
		System.out.println(dc.doAdd(2, 4));
		System.out.println(dc.doSubstract(2,6));
		
		CurrencyConverter convert = (CurrencyConverter)context.getBean("currencyconverter");
		System.out.println(convert.convertDollarsToRupees(5));
		
		Calculator calculate = (Calculator)context.getBean("simplecalculator");
		System.out.println(calculate.doMultiply(5, 10));
	}
}

