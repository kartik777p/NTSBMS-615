package com.nit.controller;

import com.nit.dto.EmployeeDTO;
import com.nit.service.EmployeeService;
import com.nit.vo.EmployeeVO;

public class EmployeeController {
    private EmployeeService service;
    //cons
	public EmployeeController(EmployeeService service) {
		System.out.println("EmployeeController  ::-1 param Constuctor");
		this.service = service;
	}
    public String processEmployee(EmployeeVO vo)throws Exception{
    	EmployeeDTO dto=null;
    	String res=null;
    	//convert vo to dto 
    	 dto=new EmployeeDTO();
    	 dto.setEname(vo.getEname());
    	 dto.setDesg(vo.getDesg());
    	 dto.setbSal(Float.parseFloat(vo.getbSal()));
    	 //use service class here
    	    res=service.registerEmployee(dto);
    	    //return res
    	return res;
    }//method
}//class
