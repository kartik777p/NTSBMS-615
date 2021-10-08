package com.nit.controller;

import com.nit.dto.StudentDTO;
import com.nit.service.IStudentMgmtService;
import com.nit.vo.StudentVO;

public class StudentController {
	private IStudentMgmtService service;
	//cons
	public StudentController(IStudentMgmtService service) {
		System.out.println("StudentController ::- 1 param Constuctor ");
		this.service = service;
	}
	public String processStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//convert vo to dto
		dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setAddrs(vo.getAddrs());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service class by passing dto class obj
		result=service.registerStudent(dto);
		//return result
		return result;
	}//method
}//class
