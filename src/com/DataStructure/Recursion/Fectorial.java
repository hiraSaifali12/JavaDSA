package com.DataStructure.Recursion;

import java.util.Scanner;

public class Fectorial {

    public static int factNum(int num){
        System.out.println("i am calculating Fectorial"+ num);

        if(num==0) return 1;
       int cal = num * factNum(num-1);
        System.out.println("done factorial"+num+"== "+ cal);
       return cal;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter factorial num:");
       int num=in.nextInt();

       int ans= factNum(num);
        System.out.println(ans);


    }
}
