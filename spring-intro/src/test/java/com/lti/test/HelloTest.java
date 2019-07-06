package com.lti.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.interfaces.Calculator;
import com.lti.component.CurrencyConverter;
import com.lti.component.TextEditor;
import com.lti.interfaces.HelloWorldInterface;

public class HelloTest {

	public static void main(String[] args) {
		//Loading Spring's IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorldInterface hw = (HelloWorldInterface) context.getBean("hellowworld");		//Factory operation. 
		System.out.println(hw.sayHello(" wolfie_boii"));
		
		Calculator calculator = (Calculator) context.getBean("calculator");
		System.out.println(calculator.doAdd(2, 4));
		System.out.println(calculator.doSub(2,6));
		
		CurrencyConverter convert = (CurrencyConverter)context.getBean("CurrencyConverter");
		System.out.println(convert.convertFromRupees(5,"China"));
		
		TextEditor texteditor = (TextEditor) context.getBean("texteditor");
		System.out.println(texteditor.load("WOOOSSHHH"));
		
	}
}

