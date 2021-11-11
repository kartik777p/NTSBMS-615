package com.nit.dto;

public class EmployeeDTO {
	private int eno;
	private String ename;
	private String desg;
	private float bSal;
	//getters and setters
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
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
	public float getbSal() {
		return bSal;
	}
	public void setbSal(float bSal) {
		this.bSal = bSal;
	}
	//toString
	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", bSal=" + bSal + "]";
	}
}
