package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.interfaces.ConverterRate;

@ Component("CurrencyConverter")  //alternative to <bean id=".." class="..">
public class CurrencyConverter {
	
	@Autowired
	ConverterRate convertRate;

	public double convertFromRupees(double money,String country_name) {
		return money * convertRate.getCurrencyValue(country_name) ;
	}
}
