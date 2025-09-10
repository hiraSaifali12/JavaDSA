package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    public static int brute(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int seclargest=arr[n-2];
        return seclargest;
    }
    public static int better(int [] arr){
        int largest=arr[0];
        int seclargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] < largest && arr[i]>seclargest){
              seclargest =arr[i];
            }
        }
        return seclargest;
    }
    public static int optimal(int[] arr){
        //1,4,3,6,6,2   lar=6 sL=4
        int largest=arr[0];
        int secLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the size of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int secLar1= brute(arr);
        //System.out.println(secLar1);
        int secLar2= better(arr);
        System.out.println(secLar2);
       // int secLar3= optimal(arr);
        //System.out.println(secLar3);
    }
}
