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
public class HelloWorldWithFactoryBeanFactoryMethod {
	
	private static HelloWorldWithFactoryBeanFactoryMethod obj;
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello 4.0 ! " + name);
	}
	
	public HelloWorldWithFactoryBeanFactoryMethod()
	{
		System.out.println("Instatiating HelloWorldWithFactoryMethod through default constructor");
		
	}
	
	public static HelloWorldWithFactoryBeanFactoryMethod instatiate()
	{
		System.out.println("Instatiating HelloWorldWithFactoryMethod through Factory Method");

		if(obj==null)
		{
			obj = new HelloWorldWithFactoryBeanFactoryMethod();
		}
		return obj;
	}

}
