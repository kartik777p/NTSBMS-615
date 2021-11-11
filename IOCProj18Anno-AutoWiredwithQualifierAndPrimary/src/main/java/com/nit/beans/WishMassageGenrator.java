package com.nit.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMassageGenrator {
	@Autowired()  //can be used at field level
	@Qualifier("dt1")
	private Date date;
	//setter
	//@Autowired    //can be used at Setter method level
	public void setDate(Date date) {
		System.out.println("WishMassageGenrator.setDate()");
		this.date=date;
	}
	//@Autowired    //can be used at orbitory method level
	public void provideDate(Date date) {
		System.out.println("WishMassageGenrator.provideDate()");
		this.date=date;
	}
	//cons
	public WishMassageGenrator() {
		System.out.println("WishMassageGenrator:: 0-param Constuctor ");
	}
	
	//b.logic
	public String genrateWishMsg(String name) {
		int hour=0;
		System.out.println(date.getYear());
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
