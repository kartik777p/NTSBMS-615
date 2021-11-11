package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;
@Repository("empDaoMysql")
public class EmployeeDaoForMysqlImpl implements EmployeeDao {
	private static final String SP_INSERT_EMP="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	@Override
	public int insertEmployee(EmployeeBO bo)throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//get pooled con obj
			con=ds.getConnection();
			//create prepared st obj having query
			ps=con.prepareStatement(SP_INSERT_EMP);
			//set values to query param
			ps.setString(1,bo.getEname());
			ps.setString(2,bo.getDesg());
			ps.setFloat(3,bo.getbSal());
			ps.setFloat(4,bo.getGrossSal());
			ps.setFloat(5,bo.getNetSal());
			//execute query
			count=ps.executeUpdate();
		}catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}catch (Exception e) {
			e.printStackTrace();
		throw e;
		}
		finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}//finally
		//return count
		return count;
	}//method
}
