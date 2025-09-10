package com.OOPS.enums;

public class enumClass {
    class dayClass{
        public static final String day1="Sunday";
        public static final String day2="Monday";
        public static final String day3="Monday";
        public static final String day4="Monday";
        public static final String day5="Monday";
        public static final String day6="Monday";


    }
    interface days{
        String day1="Sunday";
        String day2="Monday";
        String day3="Monday";
        String day4="Monday";
        String day5="Monday";
        String day6="Monday";
    }
    public enum dat{
        Mon,tue,wed,thus, fri,sat,sun
    }
    public static void main(String[] args) {

        System.out.println(dayClass.day1);
      //  System.out.println(enum);
    }
}
