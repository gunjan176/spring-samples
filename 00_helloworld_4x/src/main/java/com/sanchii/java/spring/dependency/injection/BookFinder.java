package com.sanchii.java.spring.dependency.injection;

import java.util.Map;

public interface BookFinder {

	public Map<String, Object> findBook(Map<String,Object> bookAttribute);
	
}
