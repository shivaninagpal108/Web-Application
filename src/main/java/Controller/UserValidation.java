package Controller;

public class UserValidation 
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
