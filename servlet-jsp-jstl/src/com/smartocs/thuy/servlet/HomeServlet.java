package com.smartocs.thuy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartocs.thuy.model.Employee;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Thuy1111");
		emp1.setRole("Developer");
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Thuy2222");
		emp2.setRole("Manager");
		empList.add(emp1);
		empList.add(emp2);
		request.setAttribute("empList", empList);

		request.setAttribute("htmlTagData", "<br/> creates a new line abc.");
		request.setAttribute("url", "https://www.journaldev.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

}
