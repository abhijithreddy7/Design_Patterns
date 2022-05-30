package com.abhi.abstraction;

import com.abhi.implementation.Essentials;

public class CricketTeam extends Team {
    public CricketTeam(Essentials essentials)
    {
        super(essentials);
    }

    @Override
    public void Work() {
        System.out.println("Cricket com.com.abhi.abstraction.Team");
        essentials.equipmentCheck();
        essentials.workout();
    }
}
