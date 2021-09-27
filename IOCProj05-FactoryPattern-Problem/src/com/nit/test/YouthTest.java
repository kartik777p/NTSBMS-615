package com.nit.test;

import com.nit.commons.Car;
import com.nit.commons.SportsCar;

public class YouthTest {

	public static void main(String[] args) {
		Car car=new SportsCar("NS 15 AY-5675"); // not getting abtraction on objs creation process
		//drive the cars
		car.drive();
	}

}
