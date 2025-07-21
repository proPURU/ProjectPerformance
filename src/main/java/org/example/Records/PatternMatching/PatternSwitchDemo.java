package org.example.Records.PatternMatching;

public class PatternSwitchDemo {
    public static String describe(Object obj)
    {
        return switch (obj){
            case String s->"String : "+s.toUpperCase();
            case Integer i-> "Integer: "+(i*2);
            case null -> "Null value";
            default -> "Unknown type";
        };

    }

    public static void main(String[] args) {

        System.out.println(describe("java"));  // String: JAVA
        System.out.println(describe(5));       // Integer: 10
        System.out.println(describe(null));    // Null value


    }
}
