package com.SystemDesign.SOLID.LiskovSol;

import java.util.ArrayList;
import java.util.List;

public class ErrorClass {

    public class vehicle {
        public Integer noOfwheels() {
            return 2;
        }

        public Boolean hasEngine() {
            return true;
        }
    }

    public class bike extends vehicle {

    }

    public class car extends vehicle {
        @Override
        public Integer noOfwheels() {
            return 4;
        }
    }

    public class cycle extends vehicle {
        //reducing the parent capability
        @Override
        public Boolean hasEngine() {
            return null;
        }
    }

    public static void main(String[] args) {
        ErrorClass obj = new ErrorClass();
        List<vehicle> VehicleList = new ArrayList<>();
        VehicleList.add(obj.new bike());
        VehicleList.add(obj.new car());
        VehicleList.add(obj.new cycle());

        for(vehicle v : VehicleList){
            System.out.println("wheels : "+ v.noOfwheels()+" , has engine : "+ v.hasEngine().toString());

        }

    }
}

