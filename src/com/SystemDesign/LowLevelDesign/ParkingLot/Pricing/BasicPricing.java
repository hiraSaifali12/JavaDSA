package com.SystemDesign.LowLevelDesign.ParkingLot.Pricing;

import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;


public class BasicPricing  implements  PriceStrategy{
  public double calculateFees(VehicleType vehicleType, PricingType pricingType, int duration){
        switch(vehicleType){
            case CAR:
                return pricingType==PricingType.HOURLY? duration*10 : duration*10*24;
            case TRUCK:
                return pricingType==PricingType.HOURLY? duration*20 : duration*10*24;
            case BIKE:
                return pricingType==PricingType.HOURLY? duration*5 : duration*10*24;
             default :
            throw new IllegalArgumentException("Not allowed");
        }
    }

}
