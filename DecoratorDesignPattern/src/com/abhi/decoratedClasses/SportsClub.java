package com.abhi.decoratedClasses;

import com.abhi.interfaces.Decorator;
import com.abhi.interfaces.Person;

public class SportsClub extends Decorator {

    public SportsClub(Person person) {
        super(person);
    }

    @Override
    public void work()
    {
        super.work();
        dailyWorkout();
    }

    private void dailyWorkout()
    {
        System.out.println("Sports Club members should follow a routine workout regime.");
    }

}
