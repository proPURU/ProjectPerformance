package org.example.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate=(x)->  true;

        Predicate<Integer> pred=( num)-> {
            if(num%2==0)
            {
                return true;
            }else {
                return false;
            }

        };
        Predicate<Integer> pred1= (num)-> num%2==0;

        System.out.println(pred1.test(10));

        Predicate<String> predicate0= (s)-> s.length()>5 ;

        boolean ans = predicate0.test("Hello How are you ");

        System.out.println(ans);

        // Predicate joining

        Predicate<String> predicate1= (s)-> s.length()>=5;
        Predicate<String> predicate2=(s)->s.length()%2==0;

        String string="hey hello ";

        boolean f1= predicate1.test(string);
        boolean f2=  predicate2.test(string);
        boolean ans1= predicate1.and(predicate2).test(string);
        System.out.println(ans1);



    }
}
