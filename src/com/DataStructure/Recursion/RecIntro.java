package com.DataStructure.Recursion;

public class RecIntro {

    static void fun1(int i,int n){
        if(i>n) return;
        i++;
        System.out.println("hi");
        fun1(i,n);

    }
    static void fun2(int i , int n){
        if(i>n) return;
        System.out.println("hello");
        fun2(i+1,n);
    }
    static void fun3(int i , int n){
        if(i<1) return ;
        System.out.println(i);  //It will give reverse
        fun3(i-1,n);
       // System.out.println(i);
    }
    static void fun4(int i , int n){
        if(i>n) return;

        fun4(i+1,n);
        System.out.println(i);

    }

    static void fun5(int i, int n){
        if(i<1) return;
        fun5(i-1,n);
        System.out.println(i);

    }
    static void fun6(int i,int n){
        //reverse num by backtracking
        if(i>n) return;
        fun6(i+1,n);
        System.out.println(i);
    }

    static void fun7(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        fun7(i-1,(sum+i));

    }
    static int fun8(int n){

        //functional recursion
        if(n==0) return 0;
        return n+fun8(n-1);
    }
    static int fun9(int n){
        if(n==1) return 1;
        return n*fun9(n-1);

    }
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        //fun1(1,n);
       // fun2(1,n);
        //fun3(n,n);
        //fun4(1,n);
        //fun5(n,n);
        //fun6(1,n);
       // fun7(n,sum);
       // System.out.println(fun8(n));
        System.out.println(fun9(n));
    }
}