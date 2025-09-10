package com.DataStructure.Arrays.LinearSearch;

public class sortedOrNot {
    public static boolean fun(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7};
      boolean ans= fun(arr);
        System.out.println(ans);

    }
}
