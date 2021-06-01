package com.nyash.hibernate_one_to_many_bi;

import com.nyash.hibernate_one_to_many_bi.entity.Department;
import com.nyash.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            sessionFactory.close();
        }
    }
}
