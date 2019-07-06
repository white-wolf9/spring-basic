package com.lti.component;

import org.springframework.stereotype.Component;

@Component("HDFCBankImplementation")
public class HDFCBankImplementation {

	public void doCommunicate(double amount) {
		System.out.println(amount+" debited from HDFC");
	}
}
