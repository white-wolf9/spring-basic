package com.lti.component;

import org.springframework.stereotype.Component;

@Component("spellchecker")
public class SpellChecker {

	public String spellCheck(String doc) {
		return "Checking for the document by the name "+doc;
	}
	
}
