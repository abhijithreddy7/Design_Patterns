package com.classes;

public class Drive {

    private Engine v10;

    public Engine getV10() {
        return v10;
    }

    public void setV10(Engine v10) {
        this.v10 = v10;
    }

    public void moveForward(double speed)
    {
        v10.moveForward(speed);
    }
}
