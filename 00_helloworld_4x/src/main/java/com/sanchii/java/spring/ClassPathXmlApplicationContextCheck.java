package com.sanchii.java.spring;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanchii.java.spring.dependency.injection.bean.SimpleBookLister;
import com.sanchii.java.spring.hellowworld.bean.HelloWorld;
import com.sanchii.java.spring.hellowworld.bean.HelloWorldWithFactoryBeanFactoryMethod;
import com.sanchii.java.spring.hellowworld.bean.HelloWorldWithFactoryMethod;

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
				"SpringBeans.xml");// Spring-Module.xml is kept in src/resources/spring-1
 		HelloWorld obj1 =  context.getBean("helloBean",HelloWorld.class);
		obj1.printHello();
		
		HelloWorldWithFactoryMethod obj2 =  context.getBean("helloBeanFactory",HelloWorldWithFactoryMethod.class);
		obj2.printHello();
		
		HelloWorldWithFactoryBeanFactoryMethod obj3 =  context.getBean("helloBeanMethodFactory",HelloWorldWithFactoryBeanFactoryMethod.class);
		obj3.printHello();
		
		SimpleBookLister lister = context.getBean("bookLister", SimpleBookLister.class);
		Map<String, Object> searchAttr=null;
		lister.findBook(searchAttr);
    }
}
