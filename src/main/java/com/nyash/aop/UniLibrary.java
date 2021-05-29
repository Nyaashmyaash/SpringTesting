package com.nyash.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("Book taken from Uni library");
        System.out.println("------------------------------------");
    }

    public void returnBook(){
        System.out.println("Book returned to Uni library");
        System.out.println("------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Magazine taken from Uni library");
        System.out.println("------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Magazine returned from Uni library");
        System.out.println("------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Book added to Uni library");
        System.out.println("------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Magazine added to Uni library");
        System.out.println("------------------------------------");
    }
}