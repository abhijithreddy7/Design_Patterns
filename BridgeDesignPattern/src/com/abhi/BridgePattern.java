package com.abhi;

import com.abhi.abstraction.BasketBallTeam;
import com.abhi.abstraction.CricketTeam;
import com.abhi.abstraction.Team;
import com.abhi.implementation.Coach;

public class BridgePattern {
    public static void main(String[] args)
    {
        Team team1 = new CricketTeam(new Coach());
        team1.Work();

        Team team2 = new BasketBallTeam(new Coach());
        team2.Work();
    }
}
