package com.abhi.client;

import com.abhi.bagClasses.HandBag;
import com.abhi.factory.BagFactory;
import com.abhi.interfaces.Bag;

public class Buyer {
    public static void main(String[] args)
    {
        Bag handBag = BagFactory.getBag("HandBag");

        handBag.color("Red");
        handBag.details();

        handBag.color("Black");
        handBag.details();

        Bag travelBag = BagFactory.getBag("TravelBag");

        travelBag.color("Blue");
        travelBag.details();

        travelBag.color("Grey");
        travelBag.details();
    }
}
