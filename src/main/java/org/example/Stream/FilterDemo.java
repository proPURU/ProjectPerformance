package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> ans = arr.stream().filter((x)->x%2==0).collect(Collectors.toList());

        System.out.println(ans);
    }
}
