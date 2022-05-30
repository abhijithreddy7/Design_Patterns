package com.abhi.client;

import com.abhi.factory.BagFactory;
import com.abhi.interfaces.Bag;

import java.util.Random;

public class RandomBagGenerator {

    private static String[] bagType =
            {"HandBag", "BagPack","TravelBag"};
    private static String[] colors =
            {"Red", "Blue", "Green", "Yellow", "Violet","Grey"};

    public static String getRandBagType()
    {
        Random r = new Random();
        int randInt = r.nextInt(bagType.length);
        return bagType[randInt];
    }

    public static String getRandomColor()
    {
        Random r = new Random();
        int randInt = r.nextInt(colors.length);
        return colors[randInt];
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Bag bag = BagFactory.getBag(getRandBagType());
            bag.color(getRandomColor());
            bag.details();
        }

    }
}
