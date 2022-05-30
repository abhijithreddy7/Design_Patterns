package com.abhijith.classes.chainProcessors;

import com.abhijith.classes.customArgumentType.Dimension;
import com.abhijith.interfaces.Chain;

public class OneDimensionProcessor implements Chain {

    private Chain nextInChain;
    @Override
    public void setNext(Chain nextProcessor) {
        this.nextInChain=nextProcessor;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinate().size()==1)
        {
            System.out.println("OneDimension coordinate: "+ request.getCoordinate());
        }
        else
        {
            nextInChain.process(request);
        }
    }
}
