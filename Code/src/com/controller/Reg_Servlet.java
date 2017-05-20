package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.daoImpl.EmployeeDaoImpl;

import com.utilities.JdbcConnection;





public class Reg_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Reg_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");
		String m_qualification=request.getParameter("qualification");
		String m_blood_group=request.getParameter("blood_group");
		String m_email=request.getParameter("email");
		String m_mobile=request.getParameter("mobile");
		String m_address=request.getParameter("address");
		String m_password=request.getParameter("password");
		String m_skill=request.getParameter("skill");
		String m_dob=request.getParameter("dob");
	

		Random rand = new Random();

		int  m_app_id = rand.nextInt(9999) + 1000;
		
		Employee e= new Employee(m_name, m_dob, m_gender, m_qualification, m_skill, m_blood_group, m_email, Long.parseLong(m_mobile),m_address, m_password,m_app_id);
		
		EmployeeDao ed= new EmployeeDaoImpl();
		
		boolean rec=ed.insert(e);
		if(rec==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Reg_Successful.jsp");
        	rd.forward(request, response);
		}
	}

}
