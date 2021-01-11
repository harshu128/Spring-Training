package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		String requestAction = request.getParameter("requestAction");

		if (requestAction.equalsIgnoreCase("login")) {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			LoginRepository cityRepository = new LoginRepository();

			boolean loginResult = cityRepository.checkLogin(userName, password);
			if (loginResult) {
				try {
					response.sendRedirect("index.jsp");
				} catch (Exception e) {
					System.out.println("Exception Occured:" + e);
				}
			} else {
				request.setAttribute("errorMessage", "Invalid Username/Password");
			}
			try {

				// res.sendRedirect("login.jsp");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				try {
					rd.forward(request, response);
				} catch (Exception e) {

				}

			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}

		}
	}
			
			public void doPost(HttpServletRequest request, HttpServletResponse response) {

				doGet(request, response);
			}

		}

