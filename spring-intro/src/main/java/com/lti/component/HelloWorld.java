package com.lti.component;

import com.lti.interfaces.HelloWorldInterface;

public class HelloWorld implements HelloWorldInterface {

	public String sayHello(String name) {
		return "Hello "+name;
	}
}
