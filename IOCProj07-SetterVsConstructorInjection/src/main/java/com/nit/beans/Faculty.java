package com.nit.beans;

public class Faculty {
	//mandatry cons(fid,name,age)
	private int fid;
	private String name;
	private int age;
	//optional field (clgName,subject)
	private String clgName;
	private String subject;
	//cons
	public Faculty(int fid, String name, int age) {
		this.fid = fid;
		this.name = name;
		this.age = age;
	}
	//setters 
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//toString
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", name=" + name + ", age=" + age + ", clgName=" + clgName + ", subject="
				+ subject + "]";
	}
}
