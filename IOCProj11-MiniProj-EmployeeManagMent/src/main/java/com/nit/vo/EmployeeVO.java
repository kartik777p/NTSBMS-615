package com.nit.vo;

public class EmployeeVO {
	private String eno;
	private String ename;
	private String desg;
	private String bSal;
	//Setters and Getters
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getbSal() {
		return bSal;
	}
	public void setbSal(String bSal) {
		this.bSal = bSal;
	}
	//toString
	@Override
	public String toString() {
		return "EmployeeVO [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", bSal=" + bSal + "]";
	}
	
	

}
