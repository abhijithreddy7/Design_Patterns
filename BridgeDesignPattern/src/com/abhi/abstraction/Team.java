package com.abhi.abstraction;

import com.abhi.implementation.Essentials;

abstract public class Team {
    protected Essentials essentials;

    protected Team(Essentials essentials)
    {
        this.essentials=essentials;
    }
    abstract public void Work();
}
