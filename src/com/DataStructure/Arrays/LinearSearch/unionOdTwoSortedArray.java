package com.DataStructure.Arrays.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class unionOdTwoSortedArray {
    public static void solution1(int[] arr1,int[] arr2) {

        //using hashSet
       HashMap<Integer,Integer> map=new HashMap<>();
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<arr1.length;i++){
        map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
       }
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);

        }
        for(int i: map.keySet()){
            list.add(i);
        }
        System.out.println(list);
    }
    public static void solution2(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){

            set.add(arr2[i]);
        }
        for(int i: set){
        list.add(i);
        }
        System.out.println(list);
    }

    public static void optimal(int[] arr1,int[] arr2) {
        //two pointer
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                    i++;
                }

            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[i]) {
                    union.add(arr2[j]);
                    j++;

                }
            }

            while(i<n){
                if (union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                    i++;
                }
            }
            while(j<m){
                if (union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                    j++;

                }
            }
        }
        System.out.println(union);
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,4,5};
        solution2(arr1,arr2);
        optimal(arr1,arr2);

    }
}
