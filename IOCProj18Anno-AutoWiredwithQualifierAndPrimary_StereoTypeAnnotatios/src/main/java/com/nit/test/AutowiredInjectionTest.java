package com.nit.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMassageGenrator;

public class AutowiredInjectionTest 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=null;
    	WishMassageGenrator wishmsg=null;
    	String result=null;
    	
    	//create ioc container 
    	ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
    	//get target class obj
    	wishmsg=ctx.getBean("wmg",WishMassageGenrator.class);
    	//call method
    	result=wishmsg.genrateWishMsg("kartik");
    	//print msg
    	System.out.println(result);
    	//close IOC container
    	ctx.close();
    }
}
