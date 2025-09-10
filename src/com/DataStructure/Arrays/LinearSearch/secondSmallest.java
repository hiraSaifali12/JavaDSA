package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;

public class secondSmallest {
    public static int brute(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
       // int    Sm=arr[0];
        int secSm=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[0]){
               return arr[i];
            }
        }

       // int secSm=arr[1];
        return -1;

    }
    public static int better(int[] arr) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>small && arr[i]<second_small){
                second_small=arr[i];
            }
        }
        return (second_small==Integer.MAX_VALUE ? -1 : second_small);
    }

    public static int optimal(int[] arr) {
        int small=Integer.MAX_VALUE;
        int second_small= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]) small=arr[i];
            else if(small<arr[i] && arr[i]<second_small) second_small=arr[i];
        }
        return (second_small == Integer.MAX_VALUE ? -1 : second_small);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        //int ans=brute(arr);
       // System.out.println(ans);
       //int secondSmall1=better(arr);
      //  System.out.println(secondSmall1);
        int secondSmall2 = optimal(arr);
        System.out.println(secondSmall2);

    }
}
