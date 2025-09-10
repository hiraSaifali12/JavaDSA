package com.OOPS;

public interface Bird {
    public void fly();
}
class Hen implements Bird{
    @Override
    public void fly(){
        System.out.println("implemantation of hen");
    }
}
class Eagal implements Bird{
    @Override
    public void fly(){
        System.out.println("implemantation of eagle");
    }
}


