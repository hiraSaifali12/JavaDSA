package com.DataStructure.Arrays.LinearSearch;

public class LongestSubArray {

    public static void main(String[] args) {
        int[] arr={2,3,5};
        int k=5;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
