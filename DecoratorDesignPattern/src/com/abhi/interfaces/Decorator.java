package com.abhi.interfaces;

import com.abhi.interfaces.Person;

public abstract class Decorator implements Person {

    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void work() {
        this.person.work();
    }
}
