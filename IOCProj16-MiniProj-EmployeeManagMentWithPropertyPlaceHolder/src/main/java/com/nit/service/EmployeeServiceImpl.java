package com.nit.service;

import com.nit.bo.EmployeeBO;
import com.nit.dao.EmployeeDao;
import com.nit.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeDao dao;
  //cons
public EmployeeServiceImpl(EmployeeDao dao) {
	System.out.println("EmployeeServiceImpl  ::-1 param Constuctor");
	this.dao = dao;
}
@Override
  public String registerEmployee(EmployeeDTO dto)throws Exception{
	float grossSal=0.0f;
	float netSal=0.0f;
	EmployeeBO bo=null;
	int count=0;
	
	//gather values from dto and perfrom b logic on that
	   bo=new EmployeeBO();
	   grossSal=bo.getbSal()+dto.getbSal()*0.4f;
	   netSal=grossSal - dto.getbSal()*0.2f;
	   //set data bo class obj
	   bo.setEname(dto.getEname());
	   bo.setDesg(dto.getDesg());
	   bo.setbSal(dto.getbSal());
	   bo.setGrossSal(grossSal);
	   bo.setNetSal(netSal);
	   //use dao class
	   count=dao.insertEmployee(bo);
	   /*//tradictional code take more time
	   if(count!=0)
             return "Employee Registed with netSal :- "+netSal	;  
	   else
		   return " Employee not Registed ";
		   */
	      return count==1 ?"Employee Registed with netSal :-"+netSal :"Employee not Registed " ;
  }//method
}//class
