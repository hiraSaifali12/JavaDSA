package com.DataStructure.Recursion;

import java.util.Scanner;

public class PrintNum {
    static void num(int i,int n ){
        if(i>n) return;
        System.out.println("hira");
        num(i+1,n);

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter , how many times you have to print your name:");
        int n=in.nextInt();
        num(1,n);
}
}

