package com.controller;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MbuDao;
import com.daoImpl.MbuDaoImpl;


public class ApproveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApproveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException{
	/*	int id = Integer.parseInt(request.getParameter("id"));
		
		MbuDao mDao = new MbuDaoImpl();
		int result =mDao.insert(id);
		
		if(result>0){
			System.out.println("Record Inserted Successfully");
		}*/
	}

}
