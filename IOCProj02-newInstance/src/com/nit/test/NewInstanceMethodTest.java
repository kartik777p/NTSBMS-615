package com.nit.test;

public class NewInstanceMethodTest {

	public static void main(String[] args) throws Exception {
		//load the classes
		Class clazz=Class.forName(args[0]);  //for Loading Test class            //we have to pass argument as  com.nit.commons.Test
		Class clazz2=Class.forName(args[1]);  //for Loading date class          //we have to pass argument as  java.util.Date
		//create the obj for both class
		Object obj1=clazz.newInstance();  //deprecated  return type obj
		Object obj2=clazz2.newInstance();   //deprecated  return type obj
		//now obj is created so call to string method to see data 
		System.out.println(obj1.toString());  //toString must be override in out class
		System.out.println(obj2.toString());
	}

}
