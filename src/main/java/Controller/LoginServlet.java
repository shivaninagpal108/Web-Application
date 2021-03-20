package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	UserValidation user = new UserValidation();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = request.getParameter("name");
		final String password = request.getParameter("password");
		//Case 1 -> If username and password is correct -> Welcome.jsp
		//Case 2 -> If username and passowrd is incorrect -> Error.jsp
		boolean isUserValid = user.isUserValid(name,password);
		if(isUserValid)
		{
			request.setAttribute("name", name);
			request.getRequestDispatcher("/WEB-INF/View/Welcome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errorMessage","Oops..Wrong username or password entered, please try again");
			request.getRequestDispatcher("/WEB-INF/View/Login.jsp").forward(request, response);
		}	
	}

}
