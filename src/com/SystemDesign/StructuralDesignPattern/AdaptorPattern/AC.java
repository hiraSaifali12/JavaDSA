package com.SystemDesign.StructuralDesignPattern.AdaptorPattern;

public class AC {
  public void connectViaBluetooth(){
      System.out.println("bluetooth connected");
    }
    public void startCooling(){
        System.out.println("cooling start");
    }
    public void disconnectedViaBluetooth(){
        System.out.println("bluetooth disconnected");
    }
    public void stopCooling(){
        System.out.println("cooling stop");
    }

}
class CoffeeMxn{
    public void connectViaOtherWay(){
        System.out.println("other way connected");
    }
    public void start(){
        System.out.println(" start brewing");
    }
    public void disconnectedViaOtherWay(){
        System.out.println("other way disconnected");
    }
    public void stop(){
        System.out.println(" stop brewing");
    }

}
class SmartLight{
    public void connectViaWifi(){
        System.out.println("wifi connected");
    }
    public void start(){
        System.out.println("light on");
    }
    public void disconnectedViaWifi(){
        System.out.println("wifi disconnected");
    }
    public void stop(){
        System.out.println("light off");
    }

}
class Cameras{
    public void connectViaApis(){
        System.out.println("camera connected via apis");
    }
    public void start(){
        System.out.println("camera start");
    }
    public void disconnectedApi(){
        System.out.println("camera disconnected via apis");
    }
    public void stop(){
        System.out.println("camera stop");
    }

}