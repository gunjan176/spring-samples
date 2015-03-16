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
		System.out.println("Hello 4.0 ! " + name);
	}
	
	public HelloWorld()
	{
		System.out.println("Instatiating HelloWorld through default constructor");

	}

}
