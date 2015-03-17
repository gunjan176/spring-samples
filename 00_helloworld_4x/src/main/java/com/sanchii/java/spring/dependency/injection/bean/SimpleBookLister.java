/**
 * 
 */
package com.sanchii.java.spring.dependency.injection.bean;

import java.util.Map;

import com.sanchii.java.spring.dependency.injection.BookFinder;

/**
 * Example of Construction Based Dependancy
 * 
 * @author khamgaonkarg
 *
 */
public class SimpleBookLister {

    // the BookFinder has a dependency on a MovieFinder
    private BookFinder bookFinder;

    // a constructor so that the Spring container can inject a bookFinder
    public SimpleBookLister(BookFinder bookFinder) {
        this.bookFinder = bookFinder;
    }

   
    /**
     * Function searches for book based on search Attributes
     * @param searchAttr
     * @return
     */
    public  Map<String, Object> findBook(Map <String, Object> searchAttr)
    {
    	return bookFinder.findBook(searchAttr);
    }
    
}
