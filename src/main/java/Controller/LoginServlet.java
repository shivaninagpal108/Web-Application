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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		request.setAttribute("name", name);
		//Case 1 -> If username and password is correct -> Welcome.jsp
		//Case 2 -> If username and passowrd is incorrect -> Error.jsp
		if(name.equals("Shivani") && password.equals("shanu"))
		{
			request.getRequestDispatcher("/WEB-INF/View/Welcome.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/WEB-INF/View/Error.jsp").forward(request, response);
		}	
	}

}
