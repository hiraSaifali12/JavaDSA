package com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles;

import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.*;

public class VehicleFactory {

    public static Vehicle createVehicle(
            String vehicleNumber,
            VehicleType vehicleType,
            PriceStrategy priceStrategy) {

        switch (vehicleType) {

            case CAR:
                return new Car(vehicleNumber, vehicleType, priceStrategy);

            case BIKE:
                return new Bike(vehicleNumber, vehicleType, priceStrategy);

            case TRUCK:
                return new Truck(vehicleNumber, vehicleType, priceStrategy);

            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}