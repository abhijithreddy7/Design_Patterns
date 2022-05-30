package com.abhi.client;


import com.abhi.interfaces.AutoMobile;
import com.abhi.classes.composite.VehicleType;
import com.abhi.classes.leafs.Bike;
import com.abhi.classes.leafs.Sedan;
import com.abhi.classes.leafs.Suv;

public class CompositeDesignMain {

    public static void main(String[] args)
    {
        AutoMobile verna = new Sedan("Verna","Hyundai",1000000);
        AutoMobile octavia = new Sedan("Octavia","Skoda",2600000);
        VehicleType sedan = new VehicleType();
        sedan.addToList(verna);
        sedan.addToList(octavia);

        AutoMobile fortuner = new Suv("Fortuner","Toyota",4500000);
        VehicleType suv = new VehicleType();
        suv.addToList(fortuner);

        VehicleType car =new VehicleType();
        car.addToList(sedan);
        car.addToList(suv);

        AutoMobile apache = new Bike("Apache","TVS",112000);
        AutoMobile pulsar = new Bike("Pulsar","Bajaj",150000);
        AutoMobile shine = new Bike("Shine","Honda",80000);
        AutoMobile splendor = new Bike("Splendor","Hero",75000);
        VehicleType bike =new VehicleType();
        bike.addToList(apache);
        bike.addToList(pulsar);
        bike.addToList(shine);
        bike.addToList(splendor);

        VehicleType vehicles = new VehicleType();
        vehicles.addToList(car);
        vehicles.addToList(bike);

        vehicles.showDetails();

    }
}
