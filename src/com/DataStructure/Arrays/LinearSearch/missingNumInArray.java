package com.DataStructure.Arrays.LinearSearch;

public class missingNumInArray {
    public static int brute(int[] arr){
        for(int i=1;i<=arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    count=1;
                    break;
                }
            }
            if(count==0) return i;

        }
        return -1;
    }
    public static void better(int[] arr){
        //sum of n no
        int n=arr.length;
        int N=n+1;
        int sum=N*(N+1)/2;
        int s=0;
        for(int i=0;i<n;i++){
          s=s+arr[i];
        }
        int ans=sum-s;
        System.out.println(ans);

    }
    public static void optimal(int[] arr){
        //Xor
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
      int ans=  brute(arr);
       // System.out.println(ans);
        better(arr);


    }
}
