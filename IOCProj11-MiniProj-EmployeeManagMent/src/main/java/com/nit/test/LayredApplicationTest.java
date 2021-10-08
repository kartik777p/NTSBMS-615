package com.nit.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.nit.controller.EmployeeController;
import com.nit.vo.EmployeeVO;

public class LayredApplicationTest 
{
    public static void main( String[] args )
    {
       DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
       EmployeeController controller=null;
       String name,desg=null;
       String bSal=null;
       Scanner sc=null;
       EmployeeVO vo=null;
       String result=null;
       //create ioc conatiner
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       //load xml file
       reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
       //get bean class obj
       controller=factory.getBean("empController",EmployeeController.class);
       //gather values from end user
       sc=new Scanner(System.in);
       System.out.println("Enter Employee Name :- ");
       name=sc.nextLine();
       System.out.println("Enter Desg of Employee :- ");
       desg=sc.nextLine();
       System.out.println("Enter BasicSalary of employee :- ");
      bSal=sc.nextLine();
      //set input  to vo class obj
      vo=new EmployeeVO();
      vo.setEname(name);
      vo.setDesg(desg);
      vo.setbSal(bSal);
      //now use controller class
      try {
      result=controller.processEmployee(vo);
        System.out.println(result);
    }catch (SQLException se) {
	se.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
    }//method
}//class
