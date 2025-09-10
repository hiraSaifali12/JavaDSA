package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {
    public static int brute(int[] arr) {
        //TC lon n
       /* HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
       int k=set.size();
        int j=0;
        for(int i : set){
            arr[j]=i;
            j++;
        }
        return k;*/
        //sc= On
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
           set.add(arr[i]);
        }
      //  System.out.println(set);
        int len=set.size();
        //On
        int j=0;
        for(int i : set){
            arr[j]=i;
            j++;
        }
       return len;

    }

    public static int optimal(int[] arr) {
        // Two pointer approach
        int i=0;
        for(int j=0;j<arr.length;j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return (i+1);
    }
    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,3,3}; //123
        //int n=arr.length;
       /*int k=brute(arr);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }*/
        int ans= optimal(arr);
        System.out.println(ans);



    }
}
