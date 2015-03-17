/**
 * 
 */
package com.sanchii.java.spring.dependency.injection.bean;

import java.util.Map;

import com.sanchii.java.spring.dependency.injection.BookFinder;

/**
 * @author khamgaonkarg
 *
 */
public class BookFinderBean implements BookFinder {

	/* (non-Javadoc)
	 * @see com.sanchii.java.spring.dependency.injection.BookFinder#findBook(java.util.Map)
	 */
	public Map<String, Object> findBook(Map<String, Object> bookAttribute) {
		System.out.println("Inside findBook for BookFinderBean");
		return null;
	}

}
