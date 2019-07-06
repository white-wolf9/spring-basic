package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("texteditor")
public class TextEditor {
	/*
	 * Field Injection
	 */
	@Autowired
	private SpellChecker spellchecker;

	public String load(String doc) {
		
		/*
		 * Introducing Dependency Injection
		 * SpellChecker spellchecker =new SpellChecker();
		 */
		
		return spellchecker.spellCheck(doc);
	}
	
}
