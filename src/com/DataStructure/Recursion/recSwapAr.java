package com.DataStructure.Recursion;

import static java.util.Collections.swap;

public class recSwapAr {

  static void fun1(int arr[],int l , int r){
      if(l>=r) return;
      int temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
       fun1(arr,l+1,r-1);

  }

  static void fun2(int i,int[] arr,int n){
      if(i>=n/2) return;
      int temp = arr[i];
      arr[i]=arr[n-i-1];
      arr[n-i-1]=temp;
      fun2(i+1,arr,n);

  }
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
        int l=0;
        int r = arr.length-1;
        int n=arr.length;
        //fun1(arr,l,r);
        fun2(0,arr,n);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
