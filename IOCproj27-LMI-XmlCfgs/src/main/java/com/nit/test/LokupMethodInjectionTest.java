package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Cricketer;

public class LokupMethodInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=null;
		Cricketer ck=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		//get target class obj
		ck=ctx.getBean("crick",Cricketer.class); //it is not the obj of crickter class..it is his subclass obj
		System.out.println(ck.getClass().getName());
		//call b.metods
		System.out.println("Yours score is :- "+ck.batting());
		ck.bowling();
		ck.filding();
		//close container
		ctx.close();
	}
}
