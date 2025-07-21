package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream2Demo {
    public static void main(String[] args) {


        /// /////////// DUPLICATE
        List<Integer> arr=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,7,7,8,9));
        Set<Integer> hset=new HashSet<>();

        List<Integer> ansDis= arr.stream().filter(
                (x)-> {
                    if(hset.contains(x))
                    {
                        return false;
                    }else {
                        hset.add(x);
                        return true;
                    }
                }
        ).collect(Collectors.toList());

        System.out.println("Distinct list "+ansDis);
        /// / SHORT VERSION

        List<Integer> ansDisShort= arr.stream().filter(
                (x)-> hset.add(x)).collect(Collectors.toList());


        System.out.println("Distinct list "+ansDisShort);



        List<Integer> ansDuplicate= arr.stream().filter(
                (x)-> {
                    if(hset.contains(x))
                    {
                        return true;
                    }else {
                        hset.add(x);
                        return false;
                    }
                }
        ).collect(Collectors.toList());

        System.out.println("Duplicate list "+ansDuplicate);

        /// / SHORT VERSION
        List<Integer> ansDuplicateShort= arr.stream().filter(
                (x)-> !hset.add(x)).collect(Collectors.toList());

        System.out.println("Duplicate list "+ansDuplicateShort);




//        arr.stream().filter((x)-> !hset.add(x)).collect((Collectors.toSet()))
//                .forEach((x)-> System.out.println(x));


        /// ///////////// LIMIT and SKIP
        //limit(n)
        // limit --> return list not longer than N size
        // skip(n)
        // skip --> return the list which is discard the first n element

//        List<Integer> arr1=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,7,7,8,9));
//
//        List<Integer> ans1=arr1.stream().limit(5).collect(Collectors.toList());
//
//        System.out.println(ans1);
//
//        List<Integer> arr2=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,7,7,8,9));
//
//        List<Integer> ans2=arr1.stream().skip(5).collect(Collectors.toList());
//
//        System.out.println(ans2);
//
//        /// ///////////////


        /// /////////////////////////////////////////////////////////////////////////////////////////////

        List<Integer> arr1=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,7,7,8,9));

        List<Integer> ans2=arr1.stream().sorted((i1,i2)->i1.compareTo(i2)).skip(7).collect(Collectors.toList());

        System.out.println("skip element sorted"+ans2);


        List<Integer> ans3=arr1.stream().sorted((i1,i2)->i1.compareTo(i2)).limit(5).collect(Collectors.toList());

        System.out.println("Limit element first 5"+ans3);


        /// ////////////////////////////////////////////////////////////////////////////////////////////



        //        List<String> names = List.of("John Doe", "Jane Smith", "Alice Johnson");
        //            // Output: ["John", "Jane", "Alice"]
        //
        //        List<String> ans = names.stream()
        //                .map(name -> (name.split(" ")[0]).toUpperCase()).collect(Collectors.toList());
        //
        //
        //LL
        //            System.out.println(ans);

        ///////////////////// duplicate element in a list

        /// // add() method --> Adds the specified element to this set if it is not already present
//        List<Integer> arr = Arrays.asList(11,22,3,3,3,4,5,6,7,7,8,9);
//
//       List<Integer> anss= arr.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
//       System.out.println(anss+"     --------------------   ");
//        Set<Integer> set=new HashSet<>();
//        List<Integer> ans= arr.stream().filter((x)->  !set.add(x)   ).collect(Collectors.toList());
//        System.out.println(ans);
//
//
//        String hey =" hello bro hello what are the waht error in life all solve big life ";
//        List<String> list= Arrays.asList(hey.split(" "));
//        Map<String,Long> ans1= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(ans1);
//
//        List<String> ans4= ans1.entrySet().stream().filter((x)->x.getValue()>1)
//                .map((x)-> x.getKey()).collect(Collectors.toList());
//
//        System.out.println(ans4);


    }
}
