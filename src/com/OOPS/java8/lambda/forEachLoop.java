package com.OOPS.java8.lambda;


import java.util.Arrays;
import java.util.List;

public class forEachLoop {
    public static void main(String[] args) {
       // ArrayList<Integer> list=new ArrayList<>();
        List<Integer> values= Arrays.asList(2,4,5,3,6,7);
        for(int i=0;i<values.size();i++){
            System.out.print(values.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for(int i : values){
            System.out.print(i+" ");
        }
        System.out.println();
        //for each loop in one line
        values.forEach(i -> System.out.print(i));
    }
}
