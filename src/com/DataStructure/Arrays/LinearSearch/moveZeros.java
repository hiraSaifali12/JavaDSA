package com.DataStructure.Arrays.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class moveZeros {
    public static void brute(int[] arr) {
        int n=arr.length;
      int[] temp=new int[n];
      int j=0;
      for(int i=0;i<n;i++){
        if(arr[i]!=0){
            temp[j]=arr[i];
            j++;
        }
    }
        System.out.println(Arrays.toString(temp));
    }


    public static void better(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0) {
                list.add(arr[i]);
            }
        }
        int nz=list.size();
        for(int i=0;i<nz;i++){
           arr[i]= list.get(i);
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void optimal(int[] arr) {
        int j=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void optimal1(int[] arr) {
        int j=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                swapp(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swapp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
    int[] arr={ 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};  //1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
    //brute(arr);
     //   better(arr);
        optimal(arr);
        optimal1(arr);
    }
}
