package com.nit.beans;

public class Employee {
	private int eid;
	private String name;
	private String desg;
	//cons injection  (bcz we want to all bean properties is participate in injection)
	public Employee(int eid, String name, String desg) {
		this.eid = eid;
		this.name = name;
		this.desg = desg;
	}
	//to string
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", desg=" + desg + "]";
	}
}
