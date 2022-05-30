package com.abhi.classes.leafs;

import com.abhi.interfaces.AutoMobile;

public class Sedan implements AutoMobile {

    private String model;
    private String company;
    private double cost;

    public Sedan(String model, String company, double cost) {
        this.model = model;
        this.company = company;
        this.cost = cost;
    }

    @Override
    public void showDetails() {

        System.out.println("Sedan{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                '}');
    }
}
