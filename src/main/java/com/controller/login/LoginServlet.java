package com.controller.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.todo.WelcomeTodoService;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private LoginUserValidation userValidationService = new LoginUserValidation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = request.getParameter("name");
		final String password = request.getParameter("password");
		//Case 1 -> If username and password is correct -> WelcomeTodo.jsp
		//Case 2 -> If username and passowrd is incorrect -> Login.jsp with error message
		boolean isUserValid = userValidationService.isUserValid(name,password);
		if(isUserValid)
		{
			request.getSession().setAttribute("name",name);
			response.sendRedirect(request.getContextPath()+"/todo.do");
		}
		else
		{
			request.setAttribute("errorMessage","Oops..Wrong username or password entered, please try again");
			request.getRequestDispatcher("/WEB-INF/View/Login.jsp").forward(request, response);
		}	
	}
}
