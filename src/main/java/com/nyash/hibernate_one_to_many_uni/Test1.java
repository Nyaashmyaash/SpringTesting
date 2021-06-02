package com.nyash.hibernate_one_to_many_uni;


import com.nyash.hibernate_one_to_many_uni.entity.Department;
import com.nyash.hibernate_one_to_many_uni.entity.Employee;
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
//            Department department = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Nikolas", "Cage", 1000);
//            Employee emp2 = new Employee("Mike", "Tyson", 800);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("DONE");

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Department dpt = session.get(Department.class, 3);
            System.out.println(dpt);
            System.out.println(dpt.getEmps());
            session.getTransaction().commit();
            System.out.println("DONE");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
