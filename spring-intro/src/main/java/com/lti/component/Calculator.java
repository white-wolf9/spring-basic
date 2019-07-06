package com.lti.component;

import org.springframework.stereotype.Component;

@Component("simplecalculator")
public class Calculator {
	
	public double doMultiply(double  x, double y) {
		return x*y;
	}
}
