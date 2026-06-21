package com.SystemDesign.StructuralDesignPattern.AdaptorPattern;

public class Main {
    public static void main(String[] args) {
        AC ac=new AC();
        SmartSystem sm=new AcSmartSystem(ac);
        sm.turnOn();
      //  sm.TurnOff();
    }
}
