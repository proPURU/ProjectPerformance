package org.example.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionsDemo {
    public static void main(String[] args) {



            Function<Integer , Integer> function= (i)->i*i;

            Integer ans = function.apply(5);

            // Function chaining

            Function<Integer , Integer>  doubleIt= (i)-> 2*i;
            Function<Integer , Integer>  cubeIt= (i)->i*i*i;
            System.out.println(ans);

            int andThenVar=doubleIt.andThen(cubeIt).apply(2);

            int composevar= doubleIt.compose(cubeIt).apply(2);

            System.out.println(andThenVar);
            System.out.println(composevar);

    }
}
