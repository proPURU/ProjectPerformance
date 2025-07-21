package org.example.Records.PatternMatchingPlusRecord;

public class RecordPatternDemo {

    public static String handleShape(Object obj){
        return switch (obj){
            case Shape(String t,double s)->"shape: "+t+" with size "+s;
            case Integer i->"Integer value "+i;
            default -> "unknown ";
        };
    }


    public static void main(String[] args) {

        System.out.println(handleShape(new Shape("Shape ",55)));
    }
}
