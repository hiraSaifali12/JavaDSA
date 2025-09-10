package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;

public class rotateKtimes {
    public static void brute(int[] arr,int d) {
        int n=arr.length;
    int[] temp=new int[d];
    for(int i=0;i<d;i++){
        temp[i]=arr[i];
    }
    //temp=1,2,3
        //System.out.println(Arrays.toString(temp));
        // 4,5,6,7

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        //System.out.println(Arrays.toString(arr));

        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int[] arr,int d,int n) {
        if(d>n) {
            d=d%n;
        }
      // reverse(arr,0,n-1);

     //  reverse(arr,0,d-1);
      //  reverse(arr,d,n-1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);


    }

    public static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7}; // k=2 op= 6 7 1 2 3 4 5
        int k=3;
       // brute(arr,k);
        int n=arr.length;
        optimal(arr,k,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
