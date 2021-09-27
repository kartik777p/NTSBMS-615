package com.nit.test;

import com.nit.commons.Car;
import com.nit.commons.LuxoryCar;

public class BenenessmanTest {

	public static void main(String[] args) {
		//craate car obj
		Car car=new LuxoryCar("MH 30 AS-4976"); //here customer have to create obj by own thats why he is not getting abbtrction on car manifachoring process
		                        // must constomer have the knowledge of the car obj and its dependent class obj 
		//drive the car (no need of type casting runtime polymorphisum)
		car.drive();
		

	}

}
