package com.nit.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMassageGenrator;

public class SetterInjectionTest 
{
    public static void main( String[] args )
    {
    	FileSystemResource resource=null;
    	XmlBeanFactory factory=null;
    	Object obj=null;
    	WishMassageGenrator wishmsg=null;
    	String result=null;
    	
    	//load xml file
    	resource=new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
       //crreate ioc container
    	factory=new XmlBeanFactory(resource);
    	//get target class obj
    	obj=factory.getBean("wmg");
    	//call method
    	//obj.genrateWishmsg("raja");  we can acess only direct method 
    	//cast to its own type
    	wishmsg=(WishMassageGenrator)obj;
    	//call b method
    	result=wishmsg.genrateWishMsg("kartik");
    	//print msg
    	System.out.println(result);
    	
    	
    }
}
