package com.nit.commons;

public class BudgetCar implements Car {
	public String CarNo;
	//cons
	public  BudgetCar(String no) {
		System.out.println("BudgetCar :: 1-param cons");
		CarNo=no;
	}
	
	public void drive() {
		System.out.println("BudgetCar Driving");
	}

}
