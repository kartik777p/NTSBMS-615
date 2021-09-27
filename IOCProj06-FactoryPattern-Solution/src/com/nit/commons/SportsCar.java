package com.nit.commons;

public class SportsCar implements Car {
	public String CarNo;
	//cons
	public  SportsCar(String no) {
		System.out.println("SportsCar :: 1-param cons");
		CarNo=no;
	}
	public void drive() {
		System.out.println("SportsCar  Driving");
	}

}
