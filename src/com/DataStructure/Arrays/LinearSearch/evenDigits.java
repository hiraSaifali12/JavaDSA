package com.DataStructure.Arrays.LinearSearch;

public class evenDigits {
    public static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int noOfdigit= digits(num);
        if(noOfdigit%2==0){
            return true;
        }
            return false;

    }
    public static int digits(int num){

        int count =0;
        if (num<0){
            num=num*-1;
        }
        if(num==0) return 1;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


    public static void main(String[] args) {
        int [] num={12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }
}
