package com.nit.ston;

public class Printer {
	private static Printer INSTANCE;   //lazy instantiation
	 //private cons
	private Printer() {
		System.out.println("Printer.Printer()  Private cons");
	}
	//static factory method
	public static Printer getInstance() {
		//if printer is not equals to nulll then create obj
		if(INSTANCE==null) {
			INSTANCE=new Printer();  //create obj
		}
		//if not equals to null then return that obj
		return INSTANCE;
	}//getInstance
}//class
