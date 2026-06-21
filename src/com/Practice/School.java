package com.Practice;

import java.util.Objects;

public class School {
    int rollNo;
    String name;
    @Override
    public boolean equals(Object obj) {
        School s=(School) obj;
        if(s.rollNo==this.rollNo){
            return true;
        }return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo,name);
    }



}
