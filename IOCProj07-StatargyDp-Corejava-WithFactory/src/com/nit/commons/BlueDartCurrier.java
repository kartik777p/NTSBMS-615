package com.nit.commons;

public class BlueDartCurrier implements Currier {
	
	public BlueDartCurrier() {
		System.out.println("BlueDartCurrier ::0 param cons");
	}

	@Override
	public String delivar(int oid) {
		return "Delivaring by BlueDartCurrier";
		
	}

}
