package com.DataStructure.Arrays.LinearSearch;

import java.util.Arrays;

public class mrge2srtedArr
{
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int[] nums2 = {2,5,6};
       int n = 3;
       int[] temp=new int[m+n];
       for(int i=0;i<m;i++){
           temp[i]=nums1[i];
       }
        for(int i=0;i<n;i++){
            temp[i+m]=nums2[i];
        }


        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }
}
