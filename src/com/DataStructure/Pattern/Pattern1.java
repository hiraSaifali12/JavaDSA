package com.DataStructure.Pattern;

public class Pattern1 {


    public static void main(String[] args) {
        int n=5;
        int cnt=1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}
