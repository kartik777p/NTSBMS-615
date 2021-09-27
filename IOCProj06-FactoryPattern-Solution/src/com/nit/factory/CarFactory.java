package com.nit.factory;

import com.nit.commons.BudgetCar;
import com.nit.commons.Car;
import com.nit.commons.LuxoryCar;
import com.nit.commons.SportsCar;

public class CarFactory {
	private static Car car;   //static bcz we have using that vaeribale instatic method
	
	public static Car getCar(String carName, String regNo) {
		if(carName.equalsIgnoreCase("sports")) {
			car=new SportsCar(regNo);
		}
		else if(carName.equalsIgnoreCase("Budget")) {
			car=new BudgetCar(regNo);
		}
		else if(carName.equalsIgnoreCase("luxory")) {
			car=new LuxoryCar(regNo);
		}
		else {
			throw new IllegalArgumentException("Invalid Car Name");
		}
		//now return that car to caller class
		return car;
	}

}
