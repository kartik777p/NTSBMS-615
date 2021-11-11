package com.nit.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("crick")
public abstract class Cricketer {
	
		public Cricketer() {
			System.out.println("Cricketer:: 1-param Constuctor ");
		}// cons

		@Lookup
		public abstract Bat createBat();
	
		public int batting() {
			Bat bt=null;
			int runs=0;
			System.out.println("Cricketer is batting ");
	       //ask dependent obj to @lookUp method
		     bt=createBat();
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
}//class
