package com.SystemDesign.SOLID.LiskovSol;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    class vehicle{
       //put only genric methods
       public Integer noOfWheels(){
           return 2;
       }
   }

class cycle extends vehicle{

}

class engineVhicle extends vehicle{
    Boolean hasEngine(){
        return true;
    }
}
class car extends engineVhicle{

}

class bike extends engineVhicle{

}

public static void main(String[] args) {
    Vehicle obj = new Vehicle();
    List<vehicle> listVhi = new ArrayList<>();
    listVhi.add(obj.new cycle());
    listVhi.add(obj.new bike());
    listVhi.add(obj.new car());
    for(vehicle v : listVhi){
        System.out.println("no of wheels"+v.noOfWheels()+" has a engine+v.hasEngine()-- this will not work");
    }
    List<engineVhicle> lisEn = new ArrayList<>();
    lisEn.add(obj.new bike());
    lisEn.add(obj.new car());
   // lisEn.add(obj.new cycle());-- this will give comple time error
}
}