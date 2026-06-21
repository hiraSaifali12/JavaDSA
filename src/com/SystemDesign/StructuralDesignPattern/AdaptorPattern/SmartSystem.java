package com.SystemDesign.StructuralDesignPattern.AdaptorPattern;

public interface SmartSystem {
    void turnOn();
    void turnOff();
}
class AcSmartSystem implements SmartSystem{
   private AC ac;
   public AcSmartSystem(AC ac){
       this.ac=ac;
   }
    @Override
   public void turnOn(){
        System.out.println("turn on");
        ac.connectViaBluetooth();
        ac.startCooling();
    }
    @Override
    public void turnOff(){
        System.out.println("turn off");
        ac.disconnectedViaBluetooth();
        ac.stopCooling();
    }
}
class LightSmartSystem implements SmartSystem{
   private SmartLight smartLight;
    LightSmartSystem(SmartLight smartLight){
        this.smartLight=smartLight;
    }
    @Override
    public void turnOn(){
        System.out.println("turn on");
        smartLight.connectViaWifi();
        smartLight.start();
    }
    @Override
    public void turnOff(){
        System.out.println("turn off");
        smartLight.disconnectedViaWifi();
        smartLight.stop();
    }
}
class CameraSmartSystem implements SmartSystem{
    private  Cameras cameras;
    public CameraSmartSystem(Cameras cameras){
        cameras= cameras;
    }
    @Override
    public void turnOn(){
        System.out.println("turn on");
        cameras.connectViaApis();
        cameras.start();
    }
    @Override
    public void turnOff(){
        System.out.println("turn off");
        cameras.disconnectedApi();
        cameras.stop();
    }
}
class CoffeMxnSmartSystem implements SmartSystem{
    private CoffeeMxn coffeeMxn;
    public CoffeMxnSmartSystem(CoffeeMxn coffeeMxn){
        this.coffeeMxn= coffeeMxn;
    }
    @Override
    public void turnOn(){
        System.out.println("turn on");
        coffeeMxn.connectViaOtherWay();
        coffeeMxn.start();
    }
    @Override
    public void turnOff(){
        System.out.println("turn off");
        coffeeMxn.disconnectedViaOtherWay();
        coffeeMxn.stop();
    }
}