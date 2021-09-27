package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMassageGenrator;

public class ConstructorInjectionTest 
{
    public static void main( String[] args )
    {
      //hold xml file
    	FileSystemResource res=new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
      //create ioc container having xml file
    	XmlBeanFactory factory=new XmlBeanFactory(res);
    	//get  targt class obj
    	Object obj=factory.getBean("wmg");
    	//type cast to own varibale
    	WishMassageGenrator genrator=(WishMassageGenrator)obj;
    	//call b method on genrator obj
    	System.out.println(genrator.genrateWishMsg("shubh"));
    }
}
