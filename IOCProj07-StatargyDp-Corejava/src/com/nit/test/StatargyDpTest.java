package com.nit.test;

import com.nit.commons.Currier;
import com.nit.commons.DTDCCurrier;
import com.nit.commons.Flipkart;

public class StatargyDpTest {

	public static void main(String[] args) {
		//craate taget class obj
		Flipkart flipkart=new Flipkart();
		//now create dependent class obj (we can use factoryDp here -In next Project we will devlope)
       Currier currier=new DTDCCurrier();
       //now inject dependent class to target class by using setter ijection
       flipkart.setCurrier(currier);
       //now call b.logic method on target class obj
     String status= flipkart.shopping(new String[] {"t-shart","Jeans-Pant"},new double[] {200.0f,400.0f}); //gives bill and status and also call dependent class delivar method
     System.out.println(status);
	}

}
