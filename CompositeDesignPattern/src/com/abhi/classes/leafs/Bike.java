package com.abhi.classes.leafs;

import com.abhi.interfaces.AutoMobile;

public class Bike implements AutoMobile {

    private String model;
    private String company;
    private double cost;

    public Bike(String model, String company, double cost) {
        this.model = model;
        this.company = company;
        this.cost = cost;
    }

    @Override
    public void showDetails() {

        System.out.println("Bike{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                '}');
    }
}
