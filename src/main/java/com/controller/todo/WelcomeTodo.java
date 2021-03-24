package com.controller.todo;

public class WelcomeTodo 
{
	private String name;
	public WelcomeTodo(String name) 
	{
		super();
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Todo [name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WelcomeTodo other = (WelcomeTodo) obj;
		if (name == null) 
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
