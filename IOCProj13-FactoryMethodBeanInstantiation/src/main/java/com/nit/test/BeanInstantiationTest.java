package com.nit.test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanInstantiationTest 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory factory=null;
    	XmlBeanDefinitionReader reader=null;
    	Class clazz=null;
    	Calendar cal=null;
    	Properties props=null;
    	String s2=null;
    	String str=null;
       //create  ioc container
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
       System.out.println("=================Static Factory Method ===========================================================");
       System.out.println("------------------------------Static factory metod Return its own class Object -----------------------------------");
       //get Spring bean class obj
       clazz=factory.getBean("c1",Class.class);
       //print loaded class name and its data
       System.out.println("Loaded class is ::- "+clazz.getClass()+" loaded class data is ::- "+clazz.toString());
       
       System.out.println("\n------------------------------Static factory metod Return its  related class Object -----------------------------------");
      // cal=factory.getBean("cal",Calendar.class); //here we pass super class .class property
       cal=factory.getBean("cal",GregorianCalendar.class);  //it is also possible   <Storing subclass obj in super class ref veriable>
       System.out.println("Loaded class is ::- "+cal.getClass()+" loaded class data is ::- "+cal.toString());
       
       System.out.println("\n------------------------------Static factory metod Return  Unrelated class Object -----------------------------------");
       props=factory.getBean("props",Properties.class);
       System.out.println("Loaded class is ::- "+props.getClass()+" loaded class data is ::- "+props.toString());
       System.out.println();
       
       System.out.println("=====================================Instance Factory Method============================================================");
       System.out.println("\n------------------------------INSTANCE factory metod Return its  own class Object -----------------------------------");
       s2=factory.getBean("s2",String.class);
        System.out.println("Loaded class is ::- "+s2.getClass()+" loaded class data is ::- "+s2.toString());
        System.out.println();
        System.out.println("\n------------------------------INSTANCE factory metod Return Unrelated class Object -----------------------------------");
        str=factory.getBean("str",String.class);
        System.out.println("Loaded class is ::- "+str.getClass()+" loaded class data is ::- "+str.toString());
    }
}
