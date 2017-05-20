package com.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Common_Employee;
import com.beans.Mbu_Employee;
import com.dao.EmployeeDao;
import com.dao.MbuDao;
import com.daoImpl.EmployeeDaoImpl;
import com.daoImpl.MbuDaoImpl;

/**
 * Servlet implementation class AllocateSystem
 */
public class AllocateSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllocateSystem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
PrintWriter pw=response.getWriter();
		
		String sys = "SYSTEM";
		String m_sys_id=sys.substring(0,2)+Math.round(Math.random()+1000);
		String m_name=request.getParameter("name");
		String m_gender=request.getParameter("gender");	
		String m_date=request.getParameter("joiningDate");
		String m_emp_id=request.getParameter("empid");
		
		System.out.println("JIGAR"+m_emp_id);
		
		Mbu_Employee me = new Mbu_Employee(m_emp_id, m_name, m_gender, m_date, m_sys_id);
		
		MbuDao mdao = new MbuDaoImpl();
		System.out.println("date2"+m_date);
		boolean result=mdao.insert(me);
		
		if(result==true){
			
			System.out.println("Record Inserted Successfully");
			mdao.delete(m_emp_id);
			
			RequestDispatcher rd = request.getRequestDispatcher("HrReferel.jsp");
        	rd.forward(request, response);	
        
		}else {
			System.out.println("Failed to insert");
		}
		
		
		
//Employee e= new Employee(m_name, m_dob, m_gender, m_qualification, m_skill, m_blood_group, m_email, Long.parseLong(m_mobile),m_address, m_password,m_app_id);
		/*
		//Common_Employee ce=new  ;
		
		EmployeeDao ed= new EmployeeDaoImpl();
		
		boolean rec=ed.insertCommonEmployee(ce);
		if(rec==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("hrHomePage.jsp");
        	rd.forward(request, response);
        	
        	response.sendRedirect("AcceptanceSent.jsp");

		}
		else{
			pw.println("Not sent");
			response.sendRedirect("userHomePage.jsp");
		}
		
		
	}*/

	}

}
