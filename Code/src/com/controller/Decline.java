package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.HrDao;
import com.dao.MbuDao;
import com.daoImpl.HrDaoImpl;
import com.daoImpl.MbuDaoImpl;

/**
 * Servlet implementation class Decline
 */
public class Decline extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Decline() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String m_empid = request.getParameter("id");
		String role = request.getParameter("decline");
		
		

		if (role.equalsIgnoreCase("hrReject")) {

			HrDao hDao = new HrDaoImpl();
			hDao.delete(m_empid);

			RequestDispatcher rd = request
					.getRequestDispatcher("hrHome.jsp");
			rd.forward(request, response);
		}
		
		else if (role.equalsIgnoreCase("mbuWait")) {

			
			HrDao hDao = new HrDaoImpl();
			hDao.delete(m_empid);
			MbuDao mdao = new MbuDaoImpl();
			mdao.delete(m_empid);
			
			mdao.insertCommonEmployee(m_empid);

			RequestDispatcher rd = request.getRequestDispatcher("mbuHome.jsp");
			rd.forward(request, response);
		}
		else if (role.equalsIgnoreCase("userReject")) {

			HrDao hDao = new HrDaoImpl();
			hDao.delete(m_empid);

			RequestDispatcher rd = request
					.getRequestDispatcher("userHomePage.jsp");
			rd.forward(request, response);
		}
	}

}
