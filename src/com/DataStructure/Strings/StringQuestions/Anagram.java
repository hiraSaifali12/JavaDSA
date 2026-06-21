package com.DataStructure.Strings.StringQuestions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

//first approach tc O n log n
        String str1 = "listenn";
        String str2 = "silentt";
       /* char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        //second
        if(str1.length()!=str2.length()){
            System.out.println("not anangram");
            return;
        }
        int [] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int n: freq){
          if(n!=0){
              System.out.println("not anangram");
              return;
          }
        }
        System.out.println("anagram");

    }
}