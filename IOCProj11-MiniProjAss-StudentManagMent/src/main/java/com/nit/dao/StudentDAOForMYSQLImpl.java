package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nit.bo.StudentBO;

public class StudentDAOForMYSQLImpl implements IStudentDAO {
	private static final String REALTIMEDI_SPRING_STUDENT="INSERT INTO REALTIMEDI_SPRING_STUDENT(SNAME,ADDRS,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)";
	private DataSource ds;
	//cons
	public StudentDAOForMYSQLImpl(DataSource ds) {
		System.out.println("StudentDAOForMYSQLImpl ::- 1 param Constuctor ");
		this.ds = ds;
	}
	@Override
	public int insertStudent(StudentBO bo) throws Exception {
		int count=0;
		//try with Resourses
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(REALTIMEDI_SPRING_STUDENT);
				){
			     //SET VALUES TO QUERY PARAM
			    ps.setString(1,bo.getSname());
			    ps.setString(2,bo.getAddrs());
			    ps.setFloat(3,bo.getTotal());
			    ps.setFloat(4, bo.getAvg());
			    ps.setString(5,bo.getResult());
			    //execute query
			    count=ps.executeUpdate();
		}catch (SQLException se) {
			se.printStackTrace();
			throw se;   //Exception Re-Throwing
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		//no need of finally bcz the resource will automatically at the end of the try
		//return count
		return count;
	}//method
}//class
