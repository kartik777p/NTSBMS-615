package com.nit.beans;

public class BankService {   //we can not take class as a final bcz final class doent have subclas 
	
	public BankService() {
		System.out.println("BankService1-param constuctor");
	}
	public double calcIntrrestAmmount(double pAmt, double rate, double time) {
      System.out.println("BankService.calcIntrrestAmmount()");
      //calc compound intrest
      return (pAmt*Math.pow(1+rate/100, time))-pAmt;
	}// calcIntrrestAmmount
}// class
