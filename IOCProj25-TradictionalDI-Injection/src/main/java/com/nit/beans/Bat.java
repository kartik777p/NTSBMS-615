package com.nit.beans;

import java.util.Random;

public class Bat {
  
	public Bat() {
		System.out.println("Bat :: 1-param constuctor ");
	}//cons
	
	//score run method
	public int scoreRuns() {
		return new Random().nextInt(300);
	}//scoreRuns
}//class
