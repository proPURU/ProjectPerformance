package org.example.Records.RecordsDemo;

public record Employee(String name , long sal )
{
    public Employee{

        if(name==null)
        {
         //throw new RuntimeException();
         name="default" ;
        }

    }


}
