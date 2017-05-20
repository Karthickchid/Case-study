package com.daoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sun.rmi.runtime.Log;

import com.beans.Common_Employee;
import com.beans.Employee;
import com.beans.Joining_Emp;
import com.beans.Login;
import com.beans.Mbu_Employee;

import com.dao.DisplayEmpFormDao;
import com.utilities.JdbcConnection;

public class DisplayEmpFormDaoImpl implements DisplayEmpFormDao {

	@Override
	public ArrayList<Employee> forms(Employee reg) {
		
		ArrayList<Employee> display = new ArrayList<Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from reg_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				 
				String name = rs.getString(1);
				String dob = rs.getString(2);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				String bloodGroup = rs.getString(6);
				String emailId = rs.getString(7);
				String mobile = rs.getString(8);
				String address = rs.getString(9);
				String password=rs.getString(10);
				int app_id=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				Employee reg1 = new Employee(name, dob, gender, qualification, skill, bloodGroup, emailId, Long.parseLong(mobile), address, password,app_id); 
				
				display.add(reg1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(display);
		return display;
	}
	
	
	/*public boolean fetchData(Login log){
		 

		Connection con=null;
		con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		 

		String query="select * from date_employee where e_name=? and password=?";
		try {
		pst=con.prepareStatement(query);
		pst.setString(1,log.getUserName());
		pst.setString(1,log.getPassword());
		pst.executeQuery();
		ResultSet rs=pst.executeQuery();
		if (rs.next()){
		return true;
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 

		 

		return true;
	}*/

/*
	@Override
	public ArrayList<Joining_Emp> forms(Joining_Emp je) {
		// TODO Auto-generated method stub
		return null;
	}
}*/

	public Joining_Emp getemp(String username, String password){
		
		Connection conn = JdbcConnection.getConnection();
		PreparedStatement pst = null;
		String query="select * from date_employee where e_name=? and password=?";
		try {
			pst=conn.prepareStatement(query);
		
		pst.setString(1, username);
		pst.setString(2, password);
		System.out.println("3"+username + password);
		ResultSet rs= pst.executeQuery();
		while(rs.next()){
			System.out.println("4"+rs.getString(1));
			 
			String name = rs.getString(1);
			String dob = rs.getString(2);
			String gender = rs.getString(3);
			String qualification = rs.getString(4);
			String skill = rs.getString(5);
			
			String emailId = rs.getString(6);
			String mobile = rs.getString(7);
			String joining = rs.getString(8);
			String password1=rs.getString(10);
			int app_id=rs.getInt(9);
			
			Joining_Emp je = new Joining_Emp(name, dob, gender, qualification, skill, emailId, Long.parseLong(mobile), app_id, joining, password1); 
			return je;
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


	@Override
	public ArrayList<Common_Employee> forms1(Common_Employee ce) {
		// TODO Auto-generated method stub
ArrayList<Common_Employee> display = new ArrayList<Common_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from common_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				 String emp_id=rs.getString(1);
				String name = rs.getString(2);
				String dob = rs.getString(3);
				String gender = rs.getString(4);
				String qualification = rs.getString(5);
				String skill = rs.getString(6);
				//String bloodGroup = rs.getString();
				String emailId = rs.getString(7);
				String mobile = rs.getString(8);
				String doj = rs.getString(9);
				String password=rs.getString(10);
				int app_id=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				Common_Employee reg1 = new Common_Employee(emp_id, name, password, dob, gender, qualification, skill, app_id, emailId, Long.parseLong(mobile), doj); 
				
				display.add(reg1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(display);
		return display;
		
	}


	@Override
	public ArrayList<Common_Employee> refer(Common_Employee ce) {
		// TODO Auto-generated method stub
		
ArrayList<Common_Employee> refdisplay = new ArrayList<Common_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from refer_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				 String emp_id=rs.getString(1);
				String name = rs.getString(2);
				//String dob = rs.getString(3);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				//String bloodGroup = rs.getString();
				String emailId = rs.getString(6);
				//String mobile = rs.getString(8);
				String doj = rs.getString(7);
				//String password=rs.getString(10);
				//int app_id=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				//Common_Employee reg1 = new Common_Employee(emp_id, name, password, dob, gender, qualification, skill, app_id, emailId, Long.parseLong(mobile), doj); 
				
				Common_Employee ce1=new Common_Employee(emp_id, name, gender, qualification, skill, emailId, doj);
				
				refdisplay.add(ce1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(display);
		return refdisplay;
		
		
		
	}


	@Override
	public ArrayList<Mbu_Employee> alloted(Mbu_Employee me) {
ArrayList<Mbu_Employee> display = new ArrayList<Mbu_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from mbu_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				String emp_id=rs.getString(1);
				String name = rs.getString(2);	
				String gender = rs.getString(3);
				String doj = rs.getString(4);
				String sysid=rs.getString(5);
				
				me.setEmp_id(emp_id);
				me.setName(name);
				me.setGender(gender);
				me.setDoj(doj);
				me.setSysid(sysid);
			
				display.add(me);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(display);
		return display;
		
	}
 
	}
/*@Override
	public ArrayList<Joining_Emp> forms(Joining_Emp je) {
		// TODO Auto-generated method stub
		
		ArrayList<Joining_Emp> data = new ArrayList<Joining_Emp>();
		
		Connection conn = JdbcConnection.getConnection();
		PreparedStatement pst = null;
		
		//System.out.println(je.getName());
		String query = "select * from date_employee where e_name=? and password=?";
		try {
			
			
			pst=conn.prepareStatement(query);
			pst.setString(1,je.getName());
			pst.setString(2, je.getPassword());
			System.out.println(je.getName());
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				
				 
				String name = rs.getString(1);
				String dob = rs.getString(2);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				
				String emailId = rs.getString(6);
				String mobile = rs.getString(7);
				String joining = rs.getString(8);
				String password1=rs.getString(10);
				int app_id=rs.getInt(9);
				
				je.setName(name);
				je.setDob(dob);
				je.setGender(gender);
				je.setQualification(qualification);
				je.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				je.setEmail(emailId);
				je.setMobile(mobile);
				//reg.setAddress(address);
				
				Joining_Emp je1 = new Joining_Emp(name, dob, gender, qualification, skill, emailId, Long.parseLong(mobile), app_id, joining, password1); 
				
				data.add(je1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(data);
		return data;
	}

}*/


	
/*
	@Override
ArrayList<Joining_Emp> display = new ArrayList<Joining_Emp>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			PreparedStatement pst = null;
			String query = "select * from date_employee where e_name=? and password=?";
			
			pst=conn.prepareStatement(query);
			pst.setString(1, je.getName());
			pst.setString(2,je.getPassword());
			
			ResultSet rs = pst.executeQuery(query);
			
			while(rs.next()){
				
				 
				String name = rs.getString(1);
				String dob = rs.getString(2);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				
				String emailId = rs.getString(6);
				String mobile = rs.getString(7);
				String joining = rs.getString(8);
				String password=rs.getString(10);
				int app_id=rs.getInt(9);
				
				je.setName(name);
				je.setDob(dob);
				je.setGender(gender);
				je.setQualification(qualification);
				je.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				je.setEmail(emailId);
				je.setMobile(mobile);
				//reg.setAddress(address);
				
				Joining_Emp je1 = new Joining_Emp(name, dob, gender, qualification, skill, emailId, Long.parseLong(mobile), app_id, joining, password); 
				
				display.add(je1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(display);
		return display;
	}


	@Override
	public boolean validate(String username, String password) {
		// TODO Auto-generated method stub
		Connection conn = JdbcConnection.getConnection();
		try {
			PreparedStatement pst = null;
			String query = "select * from date_employee where e_name=? and password=?";
			
			pst=conn.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2,password);
			
			ResultSet rs = pst.executeQuery(query);
			
			while(rs.next()){
				
				 
				String name = rs.getString(1);
				String dob = rs.getString(2);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				
				String emailId = rs.getString(6);
				String mobile = rs.getString(7);
				String joining = rs.getString(8);
				//String password=rs.getString(10);
				int app_id=rs.getInt(9);
				
				je.setName(name);
				je.setDob(dob);
				je.setGender(gender);
				je.setQualification(qualification);
				je.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				je.setEmail(emailId);
				je.setMobile(mobile);
				//reg.setAddress(address);
				
				Joining_Emp je1 = new Joining_Emp(name, dob, gender, qualification, skill, emailId, Long.parseLong(mobile), app_id, joining, password); 
				
				//display.add(je1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}*/



