package com.abhi.classes.stores;

import com.abhi.interfaces.Purchasable;

public class AppleStore implements Purchasable {
    @Override
    public boolean productAvailability(String model) {
        if(model == "iSeries")
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
