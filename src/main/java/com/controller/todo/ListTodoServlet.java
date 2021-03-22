package com.controller.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list-todo.do")
public class ListTodoServlet extends HttpServlet 
{
	private WelcomeTodoService userTodoService = new WelcomeTodoService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setAttribute("todos", userTodoService.retreiveTodos());
		request.getRequestDispatcher("/WEB-INF/View/WelcomeTodo.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String newTodo = request.getParameter("newTodo");
		userTodoService.addTodo(new WelcomeTodo(newTodo));
		response.sendRedirect(request.getContextPath()+"/list-todo.do");
	}

}
