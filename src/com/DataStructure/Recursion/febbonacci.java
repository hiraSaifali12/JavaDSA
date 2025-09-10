package com.DataStructure.Recursion;

import java.util.Scanner;

public class febbonacci {
static int fun(int n){
    //System.out.println("i am calculating Febo="+ n);

    if(n==1 || n==0) return n;
    int left=fun(n-1);
    int right=fun(n-2);
   // System.out.println("done febo: "+n+"== "+ left +" "+ right);
    int ans= left+right;
   // System.out.println("done febo: "+ans);
    return ans;

}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num :");
        int n=in.nextInt();
        System.out.println( fun(n));
    }
}
