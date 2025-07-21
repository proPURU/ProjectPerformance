package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1Demo {
    public static void main(String[] args) {

        ArrayList<Integer> arr1=new ArrayList<Integer>();

        ArrayList<Integer> arr =new ArrayList<>( Arrays.asList(7,5,4,7,4,6,2,3,9,15,6));
        List<Integer> array=Arrays.asList(1,2,3,4);
//        int[] arr5={1,2,3,4,5};
//        List<Integer> anss=Arrays.asList(arr5);

        //how to process element
        // sorted
        // filter

        //  streamList.forEach((x)-> System.out.println(x));

        /// ///////// SORTING ..........

        ////asc order sorting

        Stream<Integer> streamList=arr.stream().filter((x)->x>=5) .sorted();
        List<Integer> ans=streamList.collect(Collectors.toList());
        System.out.println(ans);

        ////    Desc order sorting

        List<Integer> descSort=arr.stream().
                sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());

        System.out.println(descSort);

        /// /////////// FINDING MIN MAX VALUE


        int minValue= streamList.min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(minValue);


        int maxValue= streamList.max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("max val"+ maxValue);


        ////  Processing any group of element in stream

        Stream.of(10,4,5,5,5,5,5,5,5,299,29,38)
                .filter((x)->x>=5)
                .forEach((x)->System.out.println(x));

        ArrayList<Integer> arr77 =new ArrayList<>( Arrays.asList(7,5,4,7,4,6,2,3,9,15,6));


        // asc list
        List<Integer> ansAsc= arr.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(ansAsc);

        // desc list
        List<Integer> ansDesc= arr.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(ansDesc);

        // min Element
        int ansMin = arr.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(ansMin);

        // max Element
        int ansMax = arr.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(ansMax);

        // min Element in a list // just a single element
        List<Integer> minList=arr.stream().min((i1,i2)->i1.compareTo(i2)).stream().collect(Collectors.toList());
        System.out.println(minList);






    }
}
