package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Employee;
import com.nit.beans.Faculty;
import com.nit.beans.Student;

public class SetterVsConstructorInjectionTest 
{
    public static void main( String[] args ){
    	DefaultListableBeanFactory factory;
    	XmlBeanDefinitionReader reader=null;
    	Employee emp=null;
    	Student std=null;
    	/***********************FOR CONSTRUCTOR INJECTION***************************************************************************************************/
         //create ioc container
    	factory=new DefaultListableBeanFactory();
    	reader=new XmlBeanDefinitionReader(factory);
    	//load spring bean xml file
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
    	//get target class obj
    	emp=factory.getBean("emp",Employee.class);
    	//print data of emp obj
    	System.out.println(emp.toString());
    	      //here  we dont want give any value(like desg) here then it is not possible we have to put one or more dumy value otherwise cons injection fails
    	/***********************FOR Setters INJECTION***************************************************************************************************/
     System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    	//get target class obj
    	std=factory.getBean("stud",Student.class);
    	//print that data
    	System.out.println(std.toString());
    	//here we can give our choise value means here values is not madnatory (like i we dont give age here not a problm)
    	/***********************FOR Mix Of both***************************************************************************************************/
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        Faculty faculty=factory.getBean("faculty",Faculty.class);
        //print msg 
        System.out.println(faculty.toString());

    	
    }
}
