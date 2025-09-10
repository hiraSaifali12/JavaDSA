package com.DataStructure.Recursion;

public class findElemntInAr {
    public static boolean findElement(int[] arr,int index,int target){
        if(index==arr.length-1) {
            return false;
        }
        return (arr[index]==target) || findElement(arr,index+1,target);
    }
    public static int findIndex(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,index+1,target);
        }
    }
    public static int findIndexLast(int[] arr,int index,int target){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndexLast(arr,index-1,target);
        }
    }

    public static void main(String[] args) {
       int [] arr={1,4,3,6,2};
        int target=6;
        /*System.out.println(findElement(arr,0,target));
        */
       // int ans=findIndex(arr,0,target);
      //  System.out.println(ans);
        int lastAns= findIndexLast(arr,arr.length-1,target);
        System.out.println(lastAns);
    }

}
