package com.abhi.decoratedClasses;

import com.abhi.interfaces.Decorator;
import com.abhi.interfaces.Person;

public class NGOMember extends Decorator {

    public NGOMember(Person person) {
        super(person);
    }

    @Override
    public void work()
    {
        super.work();
        voluntaryWork();
    }

    private void voluntaryWork()
    {
        System.out.println("NGO members take up social welfare activities.");
    }
}
