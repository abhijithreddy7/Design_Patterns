package com.classes;

public class EngineAdapter implements Engine{

    ModelV8 v8 = new ModelV8();

    @Override
    public void moveForward(double speed) {
        v8.move(speed);
    }
}
