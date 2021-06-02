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

        Session session = null;
        try {
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//
//            session.getTransaction().commit();
//            System.out.println("DONE");
//
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("DONE");

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE");

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
