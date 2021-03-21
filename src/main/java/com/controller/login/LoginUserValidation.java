package com.controller.login;

public class LoginUserValidation 
{
	boolean isUserValid(String name, String password)
	{
		if(name.equals("Shivani") && password.equals("shanu"))
		{
			return true;
		}
		return false;
	}
}
