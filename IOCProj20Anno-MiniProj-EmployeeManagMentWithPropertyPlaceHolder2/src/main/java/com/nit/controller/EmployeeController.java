package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.dto.EmployeeDTO;
import com.nit.service.EmployeeService;
import com.nit.vo.EmployeeVO;

@Component("empController")
public class EmployeeController {
	@Autowired
    private EmployeeService service;
  
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
