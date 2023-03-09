package com.qsp.servlet_project2_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.servlet_project2_dto.Employee;
import com.qsp.servlet_project2_service.EmployeeService;
@WebServlet("/empDetails")
public class EmployeeController extends HttpServlet{

	EmployeeService service=new EmployeeService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		Employee employee=new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpEmail(email);
		employee.setEmpGender(gender);

		
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		service.insertEmployee(employee);
		
		printWriter.write("<h3 style='color:green'>Data-Inserted-Successfully</h3>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("Employee.jsp");
		dispatcher.include(req, resp);
		printWriter.write("</html></body>");
	}
	
	
}
