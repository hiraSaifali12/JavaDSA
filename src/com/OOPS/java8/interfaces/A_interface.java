package com.OOPS.java8.interfaces;

public interface A_interface {
    public int show();
    String shows();
    public static void drop(){
        System.out.println("this is static method in interface");
    }
    default boolean look(){
        System.out.println("see");
        return true;
    }

    public static void main(String[] args) {
        A_interface.drop();
    }
}
