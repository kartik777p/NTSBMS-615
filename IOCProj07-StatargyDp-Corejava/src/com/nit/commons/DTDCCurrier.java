package com.nit.commons;

public class DTDCCurrier implements Currier {
	
	public DTDCCurrier() {
		System.out.println("DTDCCurrier ::0 param cons");
	}

	@Override
	public String delivar(int oid) {
	return "Delivaring  by DTDCCurrier ()";
	}

}
