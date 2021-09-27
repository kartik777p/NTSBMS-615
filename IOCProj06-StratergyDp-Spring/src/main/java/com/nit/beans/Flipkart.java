package com.nit.beans;

import java.util.Arrays;

public final class Flipkart {
	//currier
	private Currier currier;
	//setter method to inject dependent classs obj
	public void setCurrier(Currier currier) {
		this.currier=currier;
	}
	//cons
	public Flipkart() {
		System.out.println("Flipkart :: 0 param cons");
	}
	//B.logic
	public String shopping(String []item,double price[]) {
		int sum=0;
		//calculate sum by itrating loop
		for(int i=0;i<price.length;i++) {
			sum+=price[i]; //
		}
		//now give item to currierboy for parsal
		String status=currier.delivar(101);
		//return status and sum as a string
		return " your items are :"+Arrays.toString(item)+" "+status+"And the Price is:-"+sum;
	}

}
