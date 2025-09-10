package com.OOPS.Genrics.Bounded;

public class Main {
    public static void main(String[] args) {
        singleBound<Integer> sin=new singleBound<>();
        sin.setValue(100);
        Integer val= sin.getValue();
        System.out.println(val);

       // singleBound<String> sin1=new singleBound<>();    ---this will give error bcz we made boundry

    }


}
