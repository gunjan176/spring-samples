/**
 * 
 */
package com.sanchii.java.spring.hellowworld.service;

import com.sanchii.java.spring.hellowworld.bean.HelloWorldWithFactoryBeanFactoryMethod;

/**
 * 
 * 
 * @author khamgaonkarg
 *
 */
public class HelloWorldService {
	
	private static HelloWorldWithFactoryBeanFactoryMethod obj;
	
	public HelloWorldService()
	{
		System.out.println("Instatiating HelloWorldService through default constructor");
		
	}
	
	public HelloWorldWithFactoryBeanFactoryMethod instatiate()
	{
		System.out.println("Instatiating HelloWorldWithFactoryBeanFactoryMethod through Factory Method in HelloWorldService");

		if(obj==null)
		{
			obj = new HelloWorldWithFactoryBeanFactoryMethod();
		}
		return obj;
	}

}
