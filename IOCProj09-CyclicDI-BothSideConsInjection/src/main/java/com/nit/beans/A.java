package com.nit.beans;

public class A {
	private int b;
	//cons
public A(int b) {
		super();
		this.b = b;
	}
//toString
	@Override
	public String toString() {
		return "A [a=" + b + "]";
	}
}
