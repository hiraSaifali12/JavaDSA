package com.SystemDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;

  public class ParkingLotSpace {
    List<Slot> ParkingSpace=new ArrayList<>();
    //void addSlot(Slot slot);
}
class ParkingLot{
   private static volatile ParkingLot instance;
   private ParkingLot(){}
    public static ParkingLot createInstance(){
       if(instance==null){
           synchronized(ParkingLot.class){
               if(instance==null){
                   instance=new ParkingLot();
               }
           }
       }
        return instance;
    }

}