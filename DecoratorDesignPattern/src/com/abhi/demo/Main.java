package com.abhi.demo;

import com.abhi.basicClasses.Student;
import com.abhi.decoratedClasses.NGOMember;
import com.abhi.basicClasses.SalaryMan;
import com.abhi.decoratedClasses.SportsClub;
import com.abhi.interfaces.Person;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("\n---simple basic student---");
        Person student = new Student();
        student.work();

        System.out.println("\n---a student object that already exists is wrapped as a SportsClub member---");
        Person clubMember = new SportsClub(student);
        clubMember.work();

        System.out.println("\n---a new student object that is wrapped as a SportsClub member and a NGO member---");
        Person ngoMember = new NGOMember(new SportsClub(new Student()));
        ngoMember.work();

        System.out.println("\n---a SalaryMan---");
        Person salaryMan = new SalaryMan();
        salaryMan.work();

        System.out.println("\n---the existing salaryMan object that is decorated as a NGO member---");
        Person ngoSalaryMan = new NGOMember(salaryMan);
        ngoSalaryMan.work();
    }
}
