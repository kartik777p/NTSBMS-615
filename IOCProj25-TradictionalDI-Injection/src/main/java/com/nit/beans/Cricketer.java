package com.nit.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	// no HAS-A property here BCZ we need that obj in Only 1 Besiness method

	public Cricketer() {
		System.out.println("Cricketer:: 1-param Constuctor ");
	}// cons

	public int batting() {
		ClassPathXmlApplicationContext ctx=null;
		Bat bt=null;
		int runs=0;
      //create ioc container
	     ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
	     //get dependent class obj by Dependancy lookup 
	     bt=ctx.getBean("bat",Bat.class);
	     //now call b.method of bat method(score runs)
	     runs=bt.scoreRuns();
	     //return run to caller class
	     return runs;
	}// batting

	public void filding() {
      System.out.println("Cricketer is doing filding ");
	}// filding

	public void bowling() {
         System.out.println("bolwer is bowling..");
	}// bowling
}// class
