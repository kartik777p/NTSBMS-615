package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Cricketer;

public class TraditionalDILookupTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=null;
		Cricketer ck=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get target class obj
		ck=ctx.getBean("crick",Cricketer.class);
		//call methods  of cricketer class
		//call batting method
		System.out.println("your Run is :- "+ck.batting());
		//call bowling method
		ck.bowling();
		//call filding
		ck.filding();
		//close ioc conatiner
		ctx.close();
	}//main
}//class
