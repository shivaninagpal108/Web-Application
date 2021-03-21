package com.controller.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet 
{
	private WelcomeTodoService userTodoService = new WelcomeTodoService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String deleteTodo = request.getParameter("deleteTodo");
		userTodoService.deleteTodo(new WelcomeTodo(deleteTodo));
		response.sendRedirect(request.getContextPath()+"/todo.do");
	}
}
