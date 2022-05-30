package com.classes;

public class Car {
    public static  void main(String[] args)
    {
        Engine v10 = new EngineAdapter();
        Drive trip = new Drive();
        trip.setV10(v10);
        trip.moveForward(40);

    }
}
