package com.nit.test;

import com.nit.ston.Printer;

public class SingletoneTest {

	public static void main(String[] args) {
		//create 1st printer class obj
		Printer p1=Printer.getInstance();
		//create 2nd obj of printer class
		Printer p2=Printer.getInstance();
		//print both obj hashcode
		System.out.println("p1 obj hashcode:: ="+p1.hashCode());
		System.out.println("p2 obj hashcode:: ="+p2.hashCode());
		//compair both obj having their addrs if math then same else diff
		if(p1==p2) {
			System.out.println("Same Object ");
		}
		else {
			System.out.println("Diff Object");
		}

	}

}
