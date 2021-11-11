package com.nit.ston;

public class Printer {
	private static Printer printr;   //lazy instantiation
	 //private cons
	private Printer() {
		System.out.println("Printer.Printer()  Private cons");
	}
	//static factory method
	public static Printer getInstance() {
		//if printer is not equals to nulll then create obj
		if(printr==null) {
			printr=new Printer();  //create obj
		}
		//if not equals to null then return that obj
		return printr;
	}//getInstance
}//class
