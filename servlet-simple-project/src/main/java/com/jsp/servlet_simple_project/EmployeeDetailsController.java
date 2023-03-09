package com.jsp.servlet_simple_project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeDetailsController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.write("<html><body><table>");
		printWriter.write("<tr><th>empId</th><th>empName</th><th>empEmail</th><th>empGender</th></tr>");
		printWriter.write("<tr><td>"+id+"</td><td>"+name+"</td><td>"+email+"</td><td>"+gender+"</td><tr>");
		printWriter.write("</table></body></html>");
	}

}
