/**
 * 
 */
package com.sanchii.java.spring.hellowworld.bean;

/**
 * 
 * 
 * @author khamgaonkarg
 *
 */
public class HelloWorld {
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello 2.5 ! " + name);
	}

}
