package com.nit.bo;

public class EmployeeBO {
	private Integer eno;
	private String ename;
	private String desg;
	private float bSal;
	private float grossSal;
	private float netSal;
	//getters and setters
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
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
	public float getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(float grossSal) {
		this.grossSal = grossSal;
	}
	public float getNetSal() {
		return netSal;
	}
	public void setNetSal(float netSal) {
		this.netSal = netSal;
	}
	//toString
	@Override
	public String toString() {
		return "EmployeeBO [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", bSal=" + bSal + ", grossSal="
				+ grossSal + ", netSal=" + netSal + "]";
	}
	
}
