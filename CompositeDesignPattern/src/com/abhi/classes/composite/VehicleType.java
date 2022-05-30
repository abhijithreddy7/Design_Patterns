package com.abhi.classes.composite;

import com.abhi.interfaces.AutoMobile;

import java.util.ArrayList;
import java.util.List;

public class VehicleType implements AutoMobile{

    public VehicleType() {
    }

    private List<AutoMobile> vehicleList = new ArrayList<AutoMobile>();

    public void showDetails() {
        for(AutoMobile am:vehicleList)
        {
            am.showDetails();
        }
    }

    public void addToList(AutoMobile am)
    {
        vehicleList.add(am);
    }

    public void removeFromList(AutoMobile am)
    {
        vehicleList.remove(am);
    }

}
