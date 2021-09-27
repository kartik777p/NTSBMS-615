package com.nit.factory;
import com.nit.commons.BlueDartCurrier;
import com.nit.commons.Currier;
import com.nit.commons.DTDCCurrier;

public class CurrierFactory {
	private static Currier  currier; 
	
	public static Currier getCurrier(String name) {
		if(name.equalsIgnoreCase("DTDC")) {
			currier=new DTDCCurrier();
		}
		else if(name.equalsIgnoreCase("BlueDart")) {
			currier=new BlueDartCurrier();
		}
		else {
			throw new IllegalArgumentException("invalid Currier type");
		}
		//now return obj
		return currier;
	}
}
