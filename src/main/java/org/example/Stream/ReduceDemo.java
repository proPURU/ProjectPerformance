package org.example.Stream;

import org.example.FunctionalInterfaces.SupplierDemo;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);

        // sum of all

        Integer ans1= arr.stream().reduce(0,(a,b)->a+b);
        System.out.println(ans1);


        // multiplication

        Integer ans2= arr.stream().reduce(1,(a,b)->a+b);
        System.out.println(ans2);


        // max
        Integer ans3= arr.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b?a:b);
        System.out.println(ans3);




    }
}
