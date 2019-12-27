package com.laptrinhjavaweb.test;

import org.hibernate.Session;

import com.laptrinhjavaweb.entity.EmployeeEntity;
public class HibernateTest {
	public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");
 
        session.save(emp);
 
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
