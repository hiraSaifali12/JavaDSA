package com.DataStructure.Strings.StringQuestions;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
       String str="abcdeabcef";
       int maxLen=0;
       String longest="";
      /* for(int i=0;i<str.length();i++){
           HashSet<Character> set=new HashSet<>();
           for(int j=i;j<str.length();j++){
             if(set.contains(str.charAt(j))){
                 break;
             }
             set.add(str.charAt(j));
             int len=j-i+1;
             if(len>maxLen){
                 maxLen=len;
                 longest=str.substring(i,j+1);
             }

           }

       }
       System.out.println(longest);
        System.out.println(maxLen);*/

        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            int len=right-left+1;
            if(len>maxLen){
                maxLen=len;
                longest=str.substring(left,right+1);
            }
        }
        System.out.println(maxLen);
        System.out.println(longest);
    }
}