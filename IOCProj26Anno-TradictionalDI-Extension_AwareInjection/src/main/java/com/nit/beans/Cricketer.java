package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("crick")
public class Cricketer implements ApplicationContextAware {

	//HAS-A property to hold ctx conatiner ref varible
	private ApplicationContext ctx;
	
	public Cricketer() {
		System.out.println("Cricketer:: 1-param Constuctor ");
	}// cons

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx ;	
	}//

	public int batting() {
		Bat bt=null;
		int runs=0;
		System.out.println("Cricketer is batting ");
        //no need to create 2nd conatiner now
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
