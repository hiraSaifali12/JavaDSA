package com.OOPS.java8.interfaces;

public interface B_interface {
    int bark();
   default String eat(){
       System.out.println("hey eats");
        return "eats";
    }
    default boolean look(){
        System.out.println("see");
        return true;
    }
}
