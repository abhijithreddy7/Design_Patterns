package com.abhi.client;

import com.abhi.classes.facadeClass.Dealer;
import com.abhi.classes.paymentClass.Payment;
import com.abhi.classes.stores.AppleStore;
import com.abhi.classes.stores.SamsungStore;
import com.abhi.classes.stores.VivoStore;
import com.abhi.interfaces.Purchasable;

public class Customer {
    public static void main(String[] args)
    {
        //without Facade
    //Payment purchase = new Payment();

    //Purchasable iPhone = new AppleStore();
    //boolean iphoneAvailable = iPhone.productAvailability("iSeries");
    //purchase.paymentProcess(iphoneAvailable,"iSeries");

    //Purchasable vivoPhone = new VivoStore();
    //boolean vivoAvailable = vivoPhone.productAvailability("xSeries");
    //purchase.paymentProcess(vivoAvailable,"xSeries");

    //Purchasable samPhone = new SamsungStore();
    //boolean samAvailable = samPhone.productAvailability("sSeries");
    //purchase.paymentProcess(samAvailable,"sSeries");

        //with Facade
        Dealer store = new Dealer();
        store.purchaseModel("xSeries");
    }
}
