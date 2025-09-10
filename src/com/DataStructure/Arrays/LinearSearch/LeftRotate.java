package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;

public class LeftRotate {
    public static int[] brute(int[] arr) {
        //taking extra space
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        return temp;

    }

    public static void optimal(int[] arr) {
    int n=arr.length;
    int first=arr[0];
       for(int i=0;i<n-1;i++){
           arr[i]=arr[i+1];
       }
       arr[n-1]=first;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5}; //2,3,4,5,1
        int[] ans=brute(arr);
        //System.out.println(Arrays.toString(ans));
        optimal(arr);
        System.out.println(Arrays.toString(arr));

    }
}
