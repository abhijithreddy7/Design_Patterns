package com.abhi.classes.facadeClass;

import com.abhi.classes.stores.AppleStore;
import com.abhi.classes.paymentClass.Payment;
import com.abhi.classes.stores.SamsungStore;
import com.abhi.classes.stores.VivoStore;
import com.abhi.interfaces.Purchasable;

public class Dealer {
    public void purchaseModel(String model)
    {
        Payment purchase = new Payment();
        if(model=="iSeries")
        {
            Purchasable iPhone = new AppleStore();
            boolean iphoneAvailable = iPhone.productAvailability("iSeries");
            purchase.paymentProcess(iphoneAvailable,"iSeries");
        }
        else if (model=="xSeries")
        {
            Purchasable vivoPhone = new VivoStore();
            boolean vivoAvailable = vivoPhone.productAvailability("xSeries");
            purchase.paymentProcess(vivoAvailable,"xSeries");
        }
        else if (model=="sSeries")
        {
            Purchasable samPhone = new SamsungStore();
            boolean samAvailable = samPhone.productAvailability("sSeries");
            purchase.paymentProcess(samAvailable,"sSeries");
        }
        else
        {
          System.out.println("Model Unavailable,Cannot be purchased");
        }
    }
}
