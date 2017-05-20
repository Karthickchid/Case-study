package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.beans.Common_Employee;
import com.beans.Mbu_Employee;
import com.dao.MbuDao;
import com.utilities.JdbcConnection;

public class MbuDaoImpl implements MbuDao {
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	PreparedStatement pst1;

	public boolean insert(Mbu_Employee me) {

		conn = JdbcConnection.getConnection();

		String query = "INSERT INTO MBU_EMPLOYEE VALUES(?,?,?,?,?)";
		System.out.println("2" + me.getEmp_id());
		System.out.println(me.getSysid());
		System.out.println("date" + me.getDoj());
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, me.getEmp_id());
			pst.setString(2, me.getName());
			pst.setString(3, me.getGender());

			String date = me.getDoj();

			/*
			 * SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
			 * java.util.Date ud = sdf.parse(date); java.sql.Date sd = new
			 * java.sql.Date(ud.getTime());
			 * 
			 * pst.setDate(4, sd);
			 */

			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
			java.sql.Date sd = null;
			// java.sql.Date sd1 = null;
			try {
				java.util.Date ud = sf.parse(me.getDoj());
				sd = new java.sql.Date(ud.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;

			pst.setDate(4, sd);

			pst.setString(5, me.getSysid());

			int rec = pst.executeUpdate();

			if (rec == 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean delete(String id) {
		conn = JdbcConnection.getConnection();

		String query1 = "DELETE FROM REFER_EMPLOYEE WHERE E_ID=?";
		System.out.println("id" + id);
		try {

			pst1 = conn.prepareStatement(query1);
			pst1.setString(1, id);

			int result1 = pst1.executeUpdate();

			if (result1 > 0) {
				System.out.println("refer record deleted");
				return true;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insertCommonEmployee(String empid) {
		Connection conn = JdbcConnection.getConnection();
		PreparedStatement pst;
		
		PreparedStatement pst1;

		try {
		String query1 = "select * from common_employee1 where e_id=? ";

		pst1 = conn.prepareStatement(query1);
		pst1.setString(1, empid);
				

		ResultSet rs = pst1.executeQuery();
		
		String emp_id = null;
		String name = null;
		String password = null;
		String dob = null;
		String gender = null;
		String qualification = null;
		String skill = null;
		int application_id = 0;
		String email = null;
		long mobile = 0;
		String doj = null;

		while (rs.next()) {

			 emp_id = rs.getString(1);
			 name = rs.getString(2);
			 password = rs.getString(10);
			 dob = rs.getString(3);
			 gender = rs.getString(4);
			 qualification = rs.getString(5);
			 skill = rs.getString(6);
			 application_id = rs.getInt(11);
			 email = rs.getString(7);
			 mobile = rs.getLong(8);
			 	doj = rs.getString(9);

		}

		String query = "insert into common_employee values(?,?,?,?,?,?,?,?,?,?,?)";

		

			pst = conn.prepareStatement(query);
			pst.setString(1,emp_id);
			pst.setString(2, name);
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
			
			
			java.sql.Date sd = null;
			java.sql.Date sd1 = null;
			
			try {
				java.util.Date ud = sf.parse(dob);
				sd = new java.sql.Date(ud.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;

			pst.setDate(3, sd);
			pst.setString(4, gender);

			pst.setString(5, qualification);
			pst.setString(6, skill);

			pst.setString(7, email);

			pst.setLong(8, mobile);

			try {
				java.util.Date ud1 = sf.parse(doj);
				sd1 = new java.sql.Date(ud1.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
			pst.setDate(9, sd1);
			pst.setString(10, password);
			pst.setInt(11, application_id);

			int rec = pst.executeUpdate();
			if (rec == 1) {

				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return true;

	}
}
