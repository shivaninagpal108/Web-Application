package com.controller.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet 
{
	private WelcomeTodoService userTodoService = new WelcomeTodoService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/View/AddTodo.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String newTodoName = request.getParameter("newTodoName");
		String newTodoCategory = request.getParameter("newTodoCategory");
		userTodoService.addTodo(new WelcomeTodo(newTodoName,newTodoCategory));
		response.sendRedirect(request.getContextPath()+"/list-todo.do");
	}

}
