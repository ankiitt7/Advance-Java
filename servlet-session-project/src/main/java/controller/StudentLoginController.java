package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/studentLogin")
public class StudentLoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		String user =req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		if((user.equalsIgnoreCase("Ankit"))&&(pass.equalsIgnoreCase("Ankit@123")))
		{
			httpSession.setAttribute("userAnkit", user);
			RequestDispatcher dispatcher=req.getRequestDispatcher("myhomepage.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
			
		}
	}
}
