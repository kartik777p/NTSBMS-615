package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankService;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=null;
		BankService service=null;
		double rt=0.0d;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get target class obj
		service=ctx.getBean("calc",BankService.class);
		//call b method
		rt=service.calcIntrrestAmmount(10000, 2, 12);
		System.out.println("Intrest is :- "+rt);
		//close ioc container
		ctx.close();
	}//main
}//class
