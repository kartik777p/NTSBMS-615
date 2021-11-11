package com.nit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public final class BlueDartCurrier implements Currier {
	
	public BlueDartCurrier() {
		System.out.println("BlueDartCurrier ::0 param cons");
	}

	@Override
	public String delivar(int oid) {
		return "Delivaring by BlueDartCurrier";
		
	}

}
