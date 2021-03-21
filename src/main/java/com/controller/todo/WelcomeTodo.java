package com.controller.todo;

public class WelcomeTodo 
{
	private String name;
	public WelcomeTodo(String name) 
	{
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}
}
