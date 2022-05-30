package com.abhi.factory;

import com.abhi.bagClasses.BagPack;
import com.abhi.bagClasses.HandBag;
import com.abhi.bagClasses.TravelBag;
import com.abhi.interfaces.Bag;

import java.util.HashMap;

public class BagFactory {
    private static HashMap <String, Bag> hashMap = new HashMap<String, Bag>();

    public static Bag getBag(String type)
    {
        Bag bag = null;

        if (hashMap.containsKey(type)) {
            bag = hashMap.get(type);
        }
        else
        {
            switch(type)
            {
                case "HandBag":
                    System.out.println("\nHandBag Created\n");
                    bag = new HandBag();
                    break;
                case "BagPack":
                    System.out.println("\nBagPack Created\n");
                    bag = new BagPack();
                    break;
                case "TravelBag":
                    System.out.println("\nTravelBag Created\n");
                    bag = new TravelBag();
                    break;
                default :
                    System.out.println("\nType is Unavailable!\n");
            }
            hashMap.put(type,bag);
        }
        return bag;
    }
}
