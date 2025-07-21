package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8);
        // return a list with modifing the double of the given value


        List<Integer> ans= arr.stream().map((x)->x*2).collect(Collectors.toList());

        System.out.println(ans);
    }
}
