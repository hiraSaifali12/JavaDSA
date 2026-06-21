package com.SystemDesign.LowLevelDesign.ParkingLot.MainClass;

import com.SystemDesign.LowLevelDesign.ParkingLot.SPOT.ParkingSpot;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Vehicle;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;


import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingSpots;
    public ParkingLot(List<ParkingSpot> parkingSpot){
        this.parkingSpots= parkingSpot;
    }

    public ParkingSpot checkAvailableSpot(VehicleType vehicleType){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable() && spot.getSpotType().equals(vehicleType)){
                return spot;
            }
        }
        return null;
    }
   public ParkingSpot parkVehicle(Vehicle vehicle){
    ParkingSpot spot=   checkAvailableSpot(vehicle.getVehicleType());
 if(spot!=null){
    spot.parkVehicle(vehicle);
    System.out.println("parked vehicle successfully");
    return spot;
}
    System.out.println("No parking available");
return null;
    }
   public void vacateSpot(ParkingSpot spot, Vehicle vehicle){
        if(spot!=null && !spot.isAvailable() && spot.getVehicle().equals(vehicle)){
        spot.vacate();
            System.out.println(spot.getSlotNum()+ " vacate the spot from this vehicle "+vehicle.getVehicleType());
        }
        else{
            System.out.println("No this type of vehicle available here");
        }
   }
   public ParkingSpot getSpotByNumber(int spotNumber){
       for (ParkingSpot spot : parkingSpots) {
           if (spot.getSlotNum() == spotNumber) {
               return spot;
           }
       }
       return null;
   }
public  List<ParkingSpot> getParkingSpot(){
        return parkingSpots;
}
}
