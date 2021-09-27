package com.nit.test;

import com.nit.commons.Currier;
import com.nit.commons.DTDCCurrier;
import com.nit.commons.Flipkart;
import com.nit.factory.CurrierFactory;

public class StatargyDpTest {

	public static void main(String[] args) {
		//craate taget class obj
		Flipkart flipkart=new Flipkart();
		//here we will ask for the currierFactory for the obj 
		Currier currier=CurrierFactory.getCurrier("dtdc");
		//inject that obj to target class property by using setter injection
		flipkart.setCurrier(currier);
		//call shopping method on target class obj ......it will internally calls dependent class methdo
		String status=flipkart.shopping(new String[]{"Tsharts","sharts","Blezzers"},new double[] {200.0f,500.0f,600.0f});
		//print status of the shooping
		System.out.println(status);
	}

}
