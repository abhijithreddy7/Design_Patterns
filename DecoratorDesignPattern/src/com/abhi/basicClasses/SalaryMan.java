package com.abhi.basicClasses;

import com.abhi.interfaces.Person;

public class SalaryMan implements Person {
    @Override
    public void work() {
        System.out.println("A SalaryMan Works hard to achieve his goals.");
    }
}
