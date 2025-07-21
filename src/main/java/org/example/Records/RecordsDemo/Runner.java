package org.example.Records.RecordsDemo;

public class Runner {
    public static void main(String[] args) {
        Student obj=new Student("Purushattom",26);

        System.out.println(obj.name());
        System.out.println(obj.age());
        System.out.println(obj);


        Employee e=new Employee("Puru",200);

        Employee e1=new Employee(null,30000);

        System.out.println(e.name());
        System.out.println(e.sal());
        System.out.println(e);

        System.out.println(e1.name());
        System.out.println(e1.sal());
        System.out.println(e1);


    }
}
