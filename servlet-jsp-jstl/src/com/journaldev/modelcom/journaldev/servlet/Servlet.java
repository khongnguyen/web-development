package com.journaldev.modelcom.journaldev.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.journaldev.model.Employee;
/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hahaha");
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1); emp1.setName("Duong");emp1.setRole("Fresher");
		Employee emp2 = new Employee();
		emp2.setId(2); emp2.setName("Dat");emp2.setRole("Fresher");
		Employee emp3 = new Employee();
		emp3.setId(3); emp3.setName("Tuan");emp3.setRole("Fresher");
		Employee emp4 = new Employee();
		emp4.setId(4); emp4.setName("Thao");emp4.setRole("Fresher");
		Employee emp5 = new Employee();
		emp5.setId(5); emp5.setName("Mai");emp5.setRole("Fresher");
		Employee emp6 = new Employee();
		emp6.setId(6); emp6.setName("Lam");emp6.setRole("Fresher");
		empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);
		request.setAttribute("empList", empList);
		
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.journaldev.com");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
