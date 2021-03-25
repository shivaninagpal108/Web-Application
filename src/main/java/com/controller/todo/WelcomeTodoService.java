package com.controller.todo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeTodoService 
{
	private static final List<WelcomeTodo> todos = new ArrayList<WelcomeTodo>();
	static
	{
		todos.add(new WelcomeTodo("Learn Application Development","Study"));
		todos.add(new WelcomeTodo("Learn Spring MVC","Study"));
		todos.add(new WelcomeTodo("Learn Hibernate","Study"));
		todos.add(new WelcomeTodo("Learn Restful Services","Study"));
		todos.add(new WelcomeTodo("Learn Microservices","Study"));
	}
	public List<WelcomeTodo> retreiveTodos(){
		return todos;
	}
	public void addTodo(WelcomeTodo todo)
	{
		todos.add(todo);
	}
	public void deleteTodo(int index)
	{
		todos.remove(index);
	}
}
