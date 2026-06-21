package com.SystemDesign.LowLevelDesign.ParkingLot.SPOT;

import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Vehicle;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;

public abstract class ParkingSpot {
    int slotNum;
    Vehicle vehicle;
    private VehicleType spotType;
    boolean available;
    public ParkingSpot(int slotNum ,VehicleType spotType){
       this.slotNum=slotNum;
       this.vehicle=null;
       this.spotType=spotType;
        this.available=true;
    }
  public boolean isAvailable(){
      return available;
  }
  public abstract boolean canPark(Vehicle vehicle);
  public void parkVehicle(Vehicle vehicle){
     if(!isAvailable()){
          throw new IllegalArgumentException("parking is not available ");
     }
     if(!canPark(vehicle)){
         throw new IllegalArgumentException("parking is not available ");
     }
     this.vehicle=vehicle;
     this.available=false;
  }
  public Vehicle vacate(){
      if(isAvailable()){
          throw new IllegalArgumentException("parking slot is already vacate ");
      }
      Vehicle removeVehicle=this.vehicle;
  this.vehicle=null;
   this.available=true;
   return removeVehicle;
  }

    public VehicleType getSpotType() {
        return spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSlotNum() {
        return slotNum;
    }
}
