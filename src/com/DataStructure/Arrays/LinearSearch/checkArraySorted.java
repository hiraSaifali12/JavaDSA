package com.DataStructure.Arrays.LinearSearch;

public class checkArraySorted {
    public static boolean brute(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) return false;
            }
        }
        return true;
    }
    public static boolean optimal(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
            }

        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,1};
        //boolean ans=brute(arr);
       // System.out.println(ans);
        boolean ans=optimal(arr);
        System.out.println(ans);



    }
}
