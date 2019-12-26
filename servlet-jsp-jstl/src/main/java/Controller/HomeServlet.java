package Controller;

import Model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Employee> empList = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setId(1); emp1.setName("Pankaj");emp1.setRole("Developer");
        Employee emp2 = new Employee();
        emp2.setId(2); emp2.setName("Meghna");emp2.setRole("Manager");
        empList.add(emp1);
        empList.add(emp2);

        System.out.println(emp1.toString());

        req.setAttribute("empList", empList);

        req.setAttribute("htmlTagData", "<br/> creates a new line.");
        req.setAttribute("url", "https://www.journaldev.com");

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/view/home.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
