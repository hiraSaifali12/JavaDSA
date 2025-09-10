package com.DataStructure.Arrays.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectTwoArray {
    public static void brute(int[] arr1, int[] arr2) {
        int[] visited = new int[arr2.length];
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                   list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i]) {
                    break;
                }
            }

        }
        System.out.println(list);

    }


    public static void optimal(int[] arr1, int[] arr2) {
        ArrayList<Integer>list=new ArrayList<>();

        int i=0;
        int j=0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<=m && j<=m){
            if(arr1[i]<arr2[j]){
                i++;
            }
           else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;j++;
            }
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
      //  brute(arr1, arr2);
        optimal(arr1,arr2);

    }
}
