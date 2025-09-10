package com.DataStructure.Arrays.LinearSearch;

import java.util.Scanner;

public class largerNo {
    public static void larger(int[] arr){
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]>lar){
               lar=arr[i];
           }
        }
        System.out.println(lar);
    }
    public static int largerReturn(int[] arr){
        int lar=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
    public static void main(String[] args) {
       // int[] arr={2,5,9,4,7};

       // larger(arr);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("eneter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largerReturn(arr));
    }
}
