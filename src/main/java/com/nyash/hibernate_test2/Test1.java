package com.nyash.hibernate_test2;

import com.nyash.hibernate_test2.entity.Detail;
import com.nyash.hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Tom", "Hrady", "IT", 500);
//            Detail detail = new Detail("New York", "737-2-89", "tom@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE");

//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "977-26-89", "oleg@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE");


            session = sessionFactory.getCurrentSession();


            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);


            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
