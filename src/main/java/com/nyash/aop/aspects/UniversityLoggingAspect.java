package com.nyash.aop.aspects;

import com.nyash.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: before getStudents method -  Students list log");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);
        
        System.out.println("afterReturningGetStudentsLoggingAdvice: after getStudents method -  Students list log");
    }


//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsLoggingAdvice(){
//        System.out.println("afterReturningGetStudentsLoggingAdvice: after getStudents method -  Students list log");
//    }
}