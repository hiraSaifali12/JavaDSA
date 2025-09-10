package com.collections;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"hira");
        map.put(2,"pankaj");
        map.put(8,"sunny");
        map.put(6,"sony");
        map.put(4,"jhon");
       // System.out.println(map);
      //  String st=map.get(3);
       // System.out.println(st);

       // System.out.println(map.containsKey(12));
       // System.out.println(map.containsValue("hiraa"));

        //for printing in apmap we use keySet()
        //set does not care about ordering
     // Set<Integer> keys=  map.keySet();
      for(int i: map.keySet()){
          System.out.println(map.get(i));
      }

      Set<Map.Entry<Integer,String>> entry=map.entrySet();
      for(Map.Entry<Integer,String> ent:entry){
         // System.out.println(ent.getKey() +":"+ent.getValue());
          ent.setValue(ent.getValue().toUpperCase());
      }
        System.out.println(map);
    }


}
