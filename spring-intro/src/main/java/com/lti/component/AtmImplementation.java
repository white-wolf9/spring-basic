package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.interfaces.Atm;

@Component("AtmImplementation")
public class AtmImplementation implements Atm {
	
	@Autowired
	ICICIBankImplementation iciciBankImplementation;
	
	@Autowired
	HDFCBankImplementation hdfcBankImplementation;
	
	public void doWithdraw(String bank_name, double amount) {
		if(bank_name == "ICICI") {
			iciciBankImplementation.doCommunicate(amount);
		} else if(bank_name == "HDFC") {
			hdfcBankImplementation.doCommunicate(amount);
		}
		else
			System.out.println("Nope!");
	}

}
