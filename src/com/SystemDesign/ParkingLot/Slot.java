package com.SystemDesign.ParkingLot;

abstract class  Slot {
    int slotId;
    boolean isAvailable;
    abstract VehicleType slotType();
}
