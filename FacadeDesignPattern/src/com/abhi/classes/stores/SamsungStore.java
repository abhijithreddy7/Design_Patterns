package com.abhi.classes.stores;

import com.abhi.interfaces.Purchasable;

public class SamsungStore implements Purchasable {
    @Override
    public boolean productAvailability(String model) {
        if(model == "sSeries")
        {
            System.out.println("Product is available.");
            return true;
        }
        else
        {
            System.out.println("Product is not available.");
            return false;
        }
    }
}
