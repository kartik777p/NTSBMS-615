package com.nit.vo;

public class StudentVO {
	private String sno;
	private String sname;
	private String addrs;
	private String m1;
	private String m2;
	private String m3;
	//getters and setters
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	public String getM2() {
		return m2;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public String getM3() {
		return m3;
	}
	public void setM3(String m3) {
		this.m3 = m3;
	}
	//toString
	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + ", m1=" + m1 + ", m2=" + m2 + ", m3="
				+ m3 + "]";
	}
	

}
