package com.nit.beans;

import java.util.Date;

public class WishMassageGenrator {
	private Date date;
	 
	
	public WishMassageGenrator(Date date) {
		System.out.println("WishMassageGenrator:: 1-param constuctor");
		this.date = date;
	}
	//b.logic
	public String genrateWishMsg(String name) {
		int hour=0;
		//get hour of the day
		hour=date.getHours();
		if(hour<12) {
			return "good morning "+name;
		}else if(hour<3) {
			return "good afternoon "+name;
		}
		if(hour<7) {
			return "good evening "+name;
		}
		else {
			return "good night "+name;
		}
	}
}
