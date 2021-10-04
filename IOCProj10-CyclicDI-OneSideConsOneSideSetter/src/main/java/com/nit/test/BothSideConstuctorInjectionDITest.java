package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.A;

public class BothSideConstuctorInjectionDITest 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory factory=null;
    	XmlBeanDefinitionReader reader=null;
    	A a=null;
      //create ioc container
    	factory=new DefaultListableBeanFactory();
    	reader=new XmlBeanDefinitionReader(factory);
    	//load xml file
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
    	//get target class obj
    	a=factory.getBean("a",A.class);
    	//call to String
    	System.out.println(a.toString());
    	
    }
}
