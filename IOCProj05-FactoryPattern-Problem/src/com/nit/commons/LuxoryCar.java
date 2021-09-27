package com.nit.commons;

public class LuxoryCar implements Car {
	public String CarNo;
	//cons
	public LuxoryCar(String no) {
		System.out.println("Luxory :: 1-param cons");
		CarNo=no;
	}
	public void drive() {
		System.out.println("LuxoryCar  Driving");
	}

	

}
