package com.nit.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMassageGenrator {
	@Autowired()
	private Date date;
   
	//cons
	public WishMassageGenrator() {
		System.out.println("WishMassageGenrator:: 1-param Constuctor ");
	}
/*	    no need of setter injection here
	public void setDate(Date date) {
		this.date = date;
	}    */
	
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
