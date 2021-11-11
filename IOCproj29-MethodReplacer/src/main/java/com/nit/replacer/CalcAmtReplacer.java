package com.nit.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcAmtReplacer implements MethodReplacer {

	public CalcAmtReplacer() {
		System.out.println("CalcAmtReplacer:: 1-param constuctor ");
	}
	
	@Override                       //target class obj //target class method // target class method args
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
	   System.out.println("CalcAmtReplacer.reimplement()");
	   //get target method args values
	   double pAmt=(double)args[0]; 
	   double rate=(double)args[1];
	   double time=(double)args[2];
	   //calc new logic here(Simple intrest amt)
		return pAmt*rate*time/100;
	}//method
}//class
