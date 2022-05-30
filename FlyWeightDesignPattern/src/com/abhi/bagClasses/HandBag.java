package com.abhi.bagClasses;

import com.abhi.interfaces.Bag;

public class HandBag implements Bag {
    private final String USE;
    private final String HANDLINGCAPACITY;
    private String color;

    public HandBag()
    {
        USE = "HandBag with Small Capacity";
        HANDLINGCAPACITY ="Delicate";
    }
    @Override
    public void color(String color) {
        this.color=color;

    }

    @Override
    public void details() {
        System.out.println(color+USE+" is avaliable and can be used in "+HANDLINGCAPACITY+" Environment");

    }
}
