package com.DataStructure.GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelection {
    public static void activity(List<Integer>start, List<Integer> end){
        ArrayList<Integer> list=new ArrayList<>();
        int n=start.size();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        Collections.sort(list,(a,b)->(end.get(a)- end.get(b)));
        int maxActivity=1;

    }
    public static void main(String[] args) {
        int[] start={0,3,1,8,5,5};
        int[] end={6,4,2,9,7,9};
        //sort both array wrt end array

    }
}
