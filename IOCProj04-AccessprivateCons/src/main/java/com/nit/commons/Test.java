package com.nit.commons;

public class Test {
	private int a=10;
	private String s="shubh";
	//cons
	private Test() {
		System.out.println("Test:: 0-param constructor");
	}
  //param
	private Test(int a, String s) {
		System.out.println("Test:: 2-param constructor");
		this.a=a;
		this.s=s;
	}
	//toString
	@Override
	public String toString() {
		return "Test [a=" + a + ", s=" + s + "]";
	}
}
