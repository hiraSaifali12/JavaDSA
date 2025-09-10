package com.Pattern;

public class patternStar {
    public static void one(){
        for(int i=1;i<=4;i++) {
            for (int j=0;j<=4;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void two(){
        for(int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void three(){
        for(int i=1;i<=4;i++) {
            for (int j=i;j<=4;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void four(){
        for(int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void five(){
        for(int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void six(){
        for(int i=1;i<=4;i++) {
            for (int j=i;j<=4;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void seven(){
        for(int i=1;i<=4;i++) {
            for (int j=i;j<=4;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       //one();
     //  two();
        //three();
        //four();
        //five();
       // six();
       // seven();
    }
}
