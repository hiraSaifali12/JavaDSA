package com.DataStructure.Arrays.SortingAlgorithm;

import java.util.Arrays;

public class sorting {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++) {
                swapped = true;
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxindex= max(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    public static int max(int[] arr,int first,int last ){
        int largest=first;
        for(int i=first;i<last;i++){
            if(arr[largest]<arr[i]){
               largest=i;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
    int [] arr= {4,3,5,6,1,2};
       // bubbleSort(arr);
       // System.out.println(Arrays.toString(arr));

       // insertionSort(arr);
       // System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
