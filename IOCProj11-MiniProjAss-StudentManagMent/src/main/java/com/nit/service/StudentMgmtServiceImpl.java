package com.nit.service;

import com.nit.bo.StudentBO;
import com.nit.dao.IStudentDAO;
import com.nit.dto.StudentDTO;

public class StudentMgmtServiceImpl implements IStudentMgmtService {
   private IStudentDAO dao;
   //cons
   public StudentMgmtServiceImpl(IStudentDAO dao) {
	   System.out.println("StudentMgmtServiceImpl::- 1 param Constuctor ");
		this.dao = dao;
	}

	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		float total=0.0f;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int count=0;
		//Write b.logic here
	  	total=dto.getM1()+dto.getM2()+dto.getM3();  //get total
	  	avg=total/3;     //get avg
	  	if(dto.getM1()>=35 && dto.getM2()>=35 && dto.getM3()>=35)
	  		  result="Pass";
	  	else
	  		result="Fail";
	  	//set data to Bo class obj having persistable data
	  	bo=new StudentBO();
	  	bo.setSname(dto.getSname());
	  	bo.setAddrs(dto.getAddrs());
	  	bo.setTotal(total);
	  	bo.setAvg(avg);
	  	bo.setResult(result);
	  	//use dao here
	  	  count=dao.insertStudent(bo);
			//return meaningfull msg
	  	  return count!=0?"Student Registed Sucessfully " :" Student Not Registed Sucessfully";
	}//method	
}//class
