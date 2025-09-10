package com.OOPS.Genrics;

public class Main {
    public static void main(String[] args) {

        //without genrics no type sefty , manual type casting, no compile check
        Box<String> box=new Box<>();//box is now type safe
        box.setValue("HII");
     String val=  box.getValue();//compile time check , No type casting
        System.out.println(val);
        Box<Integer> box1=new Box<>();
        box1.setValue(100);
        Integer val1=box1.getValue();
        System.out.println(val1);

        Pair<String,Integer> pair=new Pair<>("hira",26);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());



        genricContainer<Integer>gen=new genricContainer<>();



    }
}
