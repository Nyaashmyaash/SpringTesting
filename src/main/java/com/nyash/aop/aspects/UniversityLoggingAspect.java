package com.nyash.aop.aspects;

import com.nyash.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: before getStudents method -  Students list log");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: throwing exceptions log : " + exception);
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){

        //-------------------------------
        //замена результата таргет метода
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: after getStudents method -  Students list log");
//    }


//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsLoggingAdvice(){
//        System.out.println("afterReturningGetStudentsLoggingAdvice: after getStudents method -  Students list log");

//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: method ending or exception log");
    }
}
