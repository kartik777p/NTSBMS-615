package com.nit.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("flipkart")
public final class Flipkart {
	//currier
	@Autowired
	private Currier currier;
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
