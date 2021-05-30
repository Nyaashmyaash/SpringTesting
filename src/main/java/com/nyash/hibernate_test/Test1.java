package com.nyash.hibernate_test;

import com.nyash.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Bob", "Robbins", "HR", 350);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            sessionFactory.close();
        }
    }
}
