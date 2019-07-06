package com.lti.component;

import org.springframework.stereotype.Component;

import com.lti.interfaces.ConverterRate;

@Component("ConvertRateImplementation")
public class ConvertRateImplementation implements ConverterRate {
	
	public double getCurrencyValue(String country_name) {
		double rate;
		if(country_name == "USA")
			return 65.64;
		else if(country_name == "China")
			return 10.00;
		else
			return 55;
	}

}
