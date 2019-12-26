package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			List<Student> ListS = new ArrayList<Student>();
			Student emp1 = new Student();
			emp1.setStudentId(1);
			emp1.setStudentName("Pham Dang Huu");
			emp1.setAge(21);
			emp1.setStuAddress("Ha Noi");
			emp1.setStuMail("phamdanghuu1999@gmail.com");
			emp1.setStuStatus(true);

			ListS.add(emp1);
			request.setAttribute("ListS", ListS);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			response.getWriter().print(e);
		}

	}

}
