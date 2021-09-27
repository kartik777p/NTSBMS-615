package com.nit.test;

import com.nit.commons.Car;
import com.nit.factory.CarFactory;

public class BenenessmanTest {

	public static void main(String[] args) {
		//now we dont have to create car obj manually
		//we will ask for car to factory and factory will provide car obj based on the data that
		//we pass by simply hiding the Objects cration process from the user
		//ask factory for the car obj by passing regNo
		Car car=CarFactory.getCar("luxory","MH15 AY-6908");
		//drive the cars
		car.drive();
	}

}
