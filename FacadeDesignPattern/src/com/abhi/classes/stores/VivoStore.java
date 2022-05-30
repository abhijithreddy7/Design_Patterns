package com.abhi.classes.stores;

import com.abhi.interfaces.Purchasable;

public class VivoStore implements Purchasable {
    @Override
    public boolean productAvailability(String model) {
        if(model == "xSeries")
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
