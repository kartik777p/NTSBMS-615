package com.nit.beans;

public class A {
	private int b;
	//setter
	public void setB(int b) {
		this.b=b;

	}
//toString
	@Override
	public String toString() {
		return "A [a=" + b + "]";
	}
}
