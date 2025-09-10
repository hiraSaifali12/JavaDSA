package com.SystemDesign.SOLID;

public interface InterfaceForLiskov {
    void turnOnEngine();
    void accelarate();
}
class MotorCycle implements InterfaceForLiskov{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn= true;

    }

    @Override
    public void accelarate() {
     speed=speed+10;
    }
}
class bike implements InterfaceForLiskov{
    boolean turnOnEngine;
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("engine is not available in bike");
        //Here this method is narrowing down the parent class

    }

    @Override
    public void accelarate() {
        speed=speed+5;

    }
}