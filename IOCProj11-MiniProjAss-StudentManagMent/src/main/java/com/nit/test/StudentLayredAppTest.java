package com.nit.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.StudentController;
import com.nit.vo.StudentVO;

public class StudentLayredAppTest 
{
    public static void main( String[] args )
    {
       DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
       StudentController controller=null;
       Scanner sc=null;
       String sname,addrs=null;
       String m1,m2,m3=null;
       StudentVO vo=null;
       String res=null;
       
       //create ioc container
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       //load xml file
       reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
       //get bean class obj (controller)
       controller=factory.getBean("studController",StudentController.class);
       // get input from endUser
       sc=new Scanner(System.in);
       System.out.println("Enter Student Name :- ");
       sname=sc.nextLine();
       System.out.println("Enter Student Adress :- ");
       addrs=sc.nextLine();
       System.out.println("Enter marks for m1 subject");
       m1=sc.next();
       System.out.println("Enter marks for m2 subject");
       m2=sc.next();
       System.out.println("Enter marks for m3 subject");
       m3=sc.next();
       //save all input to vo class
       vo=new StudentVO();
       vo.setSname(sname);
       vo.setAddrs(addrs);
       vo.setM1(m1);
       vo.setM2(m2);
       vo.setM3(m3);
       //use Controller class (Handle Exception here)
       try {
    	   res=controller.processStudent(vo);
    	   System.out.println(res);
       }catch (SQLException se) {
		se.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}//catch
       finally {
    	   try {
    		   if(sc!=null) {
    			   sc.close();
    		   }
    	   }catch (Exception e) {
			e.printStackTrace();
    	   }//catch
       }//finally
    }//main
}//class
