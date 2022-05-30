package com.abhi.classes.paymentClass;

public class Payment {
    public void paymentProcess(boolean available,String model)
    {
        if(available)
        {
            System.out.println("Processing Payment.");
            System.out.println("Purchased "+model+" Phone.\n\n");
        }
        else{
            System.out.println("Product not purchased\n\n");
        }
    }
}
