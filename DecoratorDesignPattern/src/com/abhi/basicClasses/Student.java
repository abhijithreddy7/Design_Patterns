package com.abhi.basicClasses;

import com.abhi.interfaces.Person;

public class Student implements Person {
    @Override
    public void work() {
        System.out.println("A Student Studies");
    }
}
