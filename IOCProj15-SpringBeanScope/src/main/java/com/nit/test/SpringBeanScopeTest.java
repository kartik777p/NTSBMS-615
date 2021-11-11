package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.WishMassageGenrator;

public class SpringBeanScopeTest 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory factory=null;
    	XmlBeanDefinitionReader reader=null;
    	WishMassageGenrator wishmsg,wishmsg1=null;
    	String result=null;
    	//create ioc container
    	factory=new DefaultListableBeanFactory();
    	reader=new XmlBeanDefinitionReader(factory);
    	//load bean defination
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
   // get spring bean class obj
    	wishmsg=factory.getBean("wmg",WishMassageGenrator.class);
    	wishmsg1=factory.getBean("wmg",WishMassageGenrator.class);
    	//get ref 
    	System.out.println(" \t wishmsg HashCode ::- "+wishmsg.hashCode()+"\t wishmsg1 HashCode ::-"+wishmsg1.hashCode());
    	System.out.println(" \t wishmsg==wishmsg1? "+(wishmsg==wishmsg1));
    	//call method
    	  result=wishmsg.genrateWishMsg("kartik");
    	  System.out.println("\t "+result);
    }//method
}//class
