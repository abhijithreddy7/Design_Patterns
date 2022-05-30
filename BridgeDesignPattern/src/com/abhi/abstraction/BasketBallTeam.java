package com.abhi.abstraction;

import com.abhi.implementation.Essentials;

public class BasketBallTeam extends Team {
    public BasketBallTeam(Essentials essentials) {
        super(essentials);
    }

    @Override
    public void Work() {
        System.out.println("BasketBall com.com.abhi.abstraction.Team");
        essentials.equipmentCheck();
        essentials.workout();
    }
}
