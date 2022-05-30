package com.abhijith.classes.main;

import com.abhijith.classes.chainProcessors.OneDimensionProcessor;
import com.abhijith.classes.chainProcessors.ThreeDimensionProcessor;
import com.abhijith.classes.chainProcessors.TwoDimensionProcessor;
import com.abhijith.classes.customArgumentType.Dimension;
import com.abhijith.interfaces.Chain;

public class Client {
    public static void main(String[] args)
    {
        Chain p1 = new OneDimensionProcessor();
        Chain p2 = new TwoDimensionProcessor();
        Chain p3 = new ThreeDimensionProcessor();
        p1.setNext(p2);
        p2.setNext(p3);

        p1.process(new Dimension(14));
        p1.process(new Dimension(14,17));
        p1.process(new Dimension(12,34,76));
        p1.process(new Dimension(12,34,76,54));
    }
}
