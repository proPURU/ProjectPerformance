package org.example.Records.PatternMatching;

public class PatternInstanceofDemo {


    public static void printLength(Object obj) {
        /// //////OLDER WAY ////////
        //        if (obj instanceof String) {
        //            String s = (String) obj;
        //            System.out.println(s.length());
        //        }



        if (obj instanceof String s) {
            System.out.println("Length: " + s.length());
        } else {
            System.out.println("Not a string");
        }
    }



    public static void main(String[] args) {
        printLength("Hello Java"); // Length: 10
        printLength(123);          // Not a string
    }
}
