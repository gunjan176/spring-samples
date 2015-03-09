package com.sanchii.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanchii.java.spring.hellowworld.bean.HelloWorld;

/**
 * This class checks the ClassPathXmlApplicationContext class to load the spring beans into memory.
 * 
 * Hello world!
 *
 */
public class ClassPathXmlApplicationContextCheck 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-1/SpringBeans.xml");// Spring-Module.xml is kept in src/resources/spring-1
 		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		obj1.printHello();
    }
}
