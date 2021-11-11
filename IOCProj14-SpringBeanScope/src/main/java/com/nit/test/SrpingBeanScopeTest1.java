package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.WishMassageGenrator;
import com.nit.ston.Printer;

public class SrpingBeanScopeTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
    	XmlBeanDefinitionReader reader=null;
    	Printer p1,p2,p01,p02=null;
    	
    	//create ioc container
    	factory=new DefaultListableBeanFactory();
    	reader=new XmlBeanDefinitionReader(factory);
    	//load bean defination
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
     //get Spring bean class obj
    	System.out.println("Having SIngletone Scope ");
    	p1=factory.getBean("p1",Printer.class);
    	p2=factory.getBean("p1",Printer.class);
    	//get both obj hashcode
    	System.out.println(" p1 obj hashcode ::- "+p1.hashCode()+" p2 obj hashcode ::- "+p2.hashCode());
    	//compair obj adress 
    	System.out.println(" p1==p2 ? "+(p1==p2));
    	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    	System.out.println("Having Prototype Scope ");
    	p01=factory.getBean("p",Printer.class);
    	p02=factory.getBean("p",Printer.class);
    	//get both obj hashcode
    	System.out.println(" p01 obj hashcode ::- "+p01.hashCode()+" p02 obj hashcode ::- "+p02.hashCode());
    	//compair obj adress 
    	System.out.println(" p1==p2 ? "+(p01==p02));
	}

}
