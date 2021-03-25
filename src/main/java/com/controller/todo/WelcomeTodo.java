package com.controller.todo;

public class WelcomeTodo 
{
	private String name;
	private String category;
	public WelcomeTodo(String name,String category) 
	{
		super();
		this.name = name;
		this.category = category;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	@Override
	public String toString() 
	{
		return "WelcomeTodo [name=" + name + ", category=" + category + "]";
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
