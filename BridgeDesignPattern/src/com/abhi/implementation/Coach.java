package com.abhi.implementation;

public class Coach implements Essentials {

    @Override
    public void equipmentCheck() {
        System.out.println("Daily Equipment Check and maintenance is Done");
    }

    @Override
    public void workout() {
        System.out.println("Daily Workout Routine is Done");
    }
}
