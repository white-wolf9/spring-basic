package com.lti.component;

import org.springframework.stereotype.Component;

import com.lti.interfaces.Bank;

@Component("HDFCBankImplementation")
public class HDFCBankImplementation implements Bank {

	public void doCommunicate(double amount) {
		System.out.println(amount+" debited from HDFC");
	}
	
}
