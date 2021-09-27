package com.nit.beans;

public final class DTDCCurrier implements Currier {
	
	public DTDCCurrier() {
		System.out.println("DTDCCurrier ::0 param cons");
	}

	@Override
	public String delivar(int oid) {
	return "Delivaring  by DTDCCurrier ()";
	}

}
