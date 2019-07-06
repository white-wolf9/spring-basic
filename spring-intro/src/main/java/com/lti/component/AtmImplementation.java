package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lti.interfaces.Atm;
import com.lti.interfaces.Bank;

@Component("AtmImplementation")
public class AtmImplementation implements Atm {
	
	
	 @Autowired
	 ICICIBankImplementation iciciBankImplementation;
	 
	 @Autowired
	 HDFCBankImplementation hdfcBankImplementation;
	 
	/*
	 * The above method of creating dependency in not dynamic enough.
	 */
	 
	@Autowired
	@Qualifier("HDFCBankImplementation")
	private Bank bank_hdfc;
	
	@Autowired
	@Qualifier("ICICIBankImplementation")
	private Bank bank_icici;
	
	
	
	public void doWithdraw(String bank_name, double amount) {
		if(bank_name == "ICICI") {
			bank_hdfc.doCommunicate(amount);
		} else if(bank_name == "HDFC") {
			bank_icici.doCommunicate(amount);
		}
		else
			System.out.println("Nope!");
	}


	/*
	 * public void doWithdraw(String bank_name, double amount ) {
	 * if(bank_name == "ICICI") {
	 * 		iciciBankImplementation.doCommunicateDeposit(amount);
	 *  }else if(bank_name == "HDFC") {
	 *  	hdfcBankImplementation.doCommunicateDeposit(amount);
	 *  }
	 *  else
	 *  	System.out.println("Nope!");
	 */
		
		
	}

