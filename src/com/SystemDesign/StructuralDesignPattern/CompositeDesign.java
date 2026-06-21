package com.SystemDesign.StructuralDesignPattern;
import com.SystemDesign.StructuralDesignPattern.AdaptorPattern.SmartSystem;

import java.util.ArrayList;
import java.util.List;

public class CompositeDesign implements SmartSystem{
    List<SmartSystem> smartSystemList=new ArrayList<>();
   public void addList(SmartSystem smartSystem ){
       smartSystemList.add(smartSystem);
    }
    public void removeList(SmartSystem smartSystem ){
     smartSystemList.remove(smartSystem);
    }

    @Override
    public void turnOn() {
       for(SmartSystem smartSystem :smartSystemList){
           smartSystem.turnOn();
       }

    }

    @Override
    public void turnOff() {
        for(SmartSystem smartSystem :smartSystemList){
            smartSystem.turnOff();
        }
    }

    public static void main(String[] args) {

        CompositeDesign component1=new CompositeDesign();
    }
}
