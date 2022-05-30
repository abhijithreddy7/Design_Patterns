package com.abhijith.classes.customArgumentType;

import java.util.ArrayList;
import java.util.List;

public class Dimension {
    private List<Integer> coordinate;

    public Dimension(int... x)
    {
        this.coordinate = new ArrayList<Integer>(x.length);
        for(int i: x)
        {
            coordinate.add(i);
        }
    }

    public List<Integer> getCoordinate() {
        return coordinate;
    }
}
