package com.SystemDesign.LowLevelDesign.ParkingLot.SPOT;

import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Vehicle;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(int slotNum , VehicleType spotType){
        super( slotNum , spotType);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle.getVehicleType()==VehicleType.CAR;
    }
}
