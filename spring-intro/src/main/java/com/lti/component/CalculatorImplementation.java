package com.lti.component;

import org.springframework.stereotype.Component;

import com.lti.interfaces.Calculator;

@Component("calculator")
public class CalculatorImplementation implements Calculator {
	
	public int doAdd(int x, int y) {
		return x+y;
	}
	public int doSub(int x, int y) {
		return x-y;
	}
	public int doMul(int x, int y) {
		return x*y;
	}
	public int doDiv(int x, int y) {
		return x/y;
	}
	
}
