package com.nit.beans;

public class Student {
	private int sid;
	private String name;
	private String age;
	private int marks;
	private String addrs;
	//genrat setters method
	
	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	//to string
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + ", addrs=" + addrs
				+ "]";
	}
}
