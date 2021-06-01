package com.nyash.hibernate_one_to_one;

import com.nyash.hibernate_one_to_one.entity.Detail;
import com.nyash.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Nikolas", "Cage", "HR", 850);
//            Detail detail = new Detail("New-York", "77-266-8", "nikolas@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//            session.getTransaction().commit();
//            System.out.println("DONE");

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();
//            System.out.println("DONE");

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 3);
            Detail detail = session.get(Detail.class, 3);
            emp.setEmpDetail(detail);
            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
