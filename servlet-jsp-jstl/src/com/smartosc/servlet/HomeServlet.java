package com.smartosc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartosc.model.Student;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> stuList = new ArrayList<>();
		Student stu1 = new Student(1, "thanh", "fresher");
		Student stu2 = new Student(2, "thanh", "beginner");
		stuList.add(stu1);
		stuList.add(stu2);
		System.out.println(stuList.add(stu1));
		request.setAttribute("stuList", stuList);

		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.thanh.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
}
