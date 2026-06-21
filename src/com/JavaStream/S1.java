package com.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class S1 {
    public static void main(String[] args) {

        //Given list of emails, print only valid ones (must contain "@")

        List<String> email= List.of("@gmail.com","abc.com","@yahoo.com");
        Predicate<String> isValid= n->n.contains("@");
        email.stream().filter(isValid).forEach(System.out::println);


        //Filter numbers which are: greater than 10 and even
        //even 2,4,6 which can be divisible by 2 n%2==0

        List<Integer> list=List.of(28,7,11,9,33,10,12,24,25,2);
        Predicate<Integer> isGreater=n->n>10;
        Predicate<Integer> even=n->n%2==0;
        list.stream().filter(even.and(isGreater)).forEach(System.out::println);



        //Convert all names to uppercase
        List<String> name=List.of("hira","saifali","pankaj","kumar");
        Function<String,String> uppercase= n -> n.toUpperCase();
        name.stream().map(uppercase).forEach(System.out::println);


        //Print names with length > 4
        List<String> namePrint=List.of("hira","saifali","pankaj","kumar");
        Predicate<String> print=n->n.length()>4;
        namePrint.stream().filter(print).forEach(System.out::println);


        //Generate 5 random numbers
        Supplier<Double> randomNo=()->Math.random();
        for(int i=0;i<5;i++){
            System.out.println(randomNo.get());
        }

    }
}
