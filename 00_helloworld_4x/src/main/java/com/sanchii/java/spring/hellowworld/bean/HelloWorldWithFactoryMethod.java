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
public class HelloWorldWithFactoryMethod {
	
	private static HelloWorldWithFactoryMethod obj;
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello 4.0 ! " + name);
	}
	
	private HelloWorldWithFactoryMethod()
	{
		System.out.println("Instatiating HelloWorldWithFactoryMethod through default constructor");
		
	}
	
	public static HelloWorldWithFactoryMethod instatiate()
	{
		System.out.println("Instatiating HelloWorldWithFactoryMethod through Factory Method");

		if(obj==null)
		{
			obj = new HelloWorldWithFactoryMethod();
		}
		return obj;
	}

}
