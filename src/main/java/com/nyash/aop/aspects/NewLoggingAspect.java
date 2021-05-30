package com.nyash.aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying return into library");

        Long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Преступление и Наказание";
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook works " +
                (System.currentTimeMillis() - begin) + " ms");

        System.out.println("aroundReturnBookLoggingAdvice: book returned successfully into library");
        return targetMethodResult;
    }
}
