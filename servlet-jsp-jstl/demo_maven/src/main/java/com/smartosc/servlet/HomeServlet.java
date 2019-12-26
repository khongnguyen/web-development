package com.smartosc.servlet;

import com.smartosc.model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> empList = new ArrayList<Employee>();
        Employee emp1 = new Employee();
        emp1.setId(1); emp1.setName("Pankaj");emp1.setRole("Developer");
        Employee emp2 = new Employee();
        emp2.setId(2); emp2.setName("Meghna");emp2.setRole("Manager");
        empList.add(emp1);empList.add(emp2);
        request.setAttribute("empList", empList);

        request.setAttribute("htmlTagData", "<br/> creates a new line.");
        request.setAttribute("url", "https://www.journaldev.com");
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}
