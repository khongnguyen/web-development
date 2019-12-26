package ladylee.servlet;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ladylee.model.Employee;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID  = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Trần Phương Thảo");
		emp1.setRole("Boss");
		
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Đỗ Văn Nam");
		emp2.setRole("Admin");
		
		empList.add(emp2);
		req.setAttribute("empList", empList);
		req.setAttribute("htmlTagData", "<br/> creates a new line.");
		req.setAttribute("url", "https://www.journaldev.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		rd.forward(req, res);
	}
	
	
}
