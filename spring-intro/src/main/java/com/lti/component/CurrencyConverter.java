package com.lti.component;

import org.springframework.stereotype.Component;

@ Component("currencyconverter")  //alternative to <bean id=".." class="..">
public class CurrencyConverter {

	public double convertDollarsToRupees(double dollars) {
		return dollars * 68.44 ;
	}
}
