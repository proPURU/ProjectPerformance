package org.example.Optional;

import java.util.Optional;

public class Code2 {

    public static void main(String[] args) {

        Code2 obj=new Code2();
        Optional<String> name = obj.getName();
        // we can check with null
        if(!name.isEmpty()) {
            System.out.println(name);
        }
        // Other ways to handle this
        String name1=name.orElse("Not having name ");
        System.out.println(name1);
        System.out.println();
        name.ifPresent((n)->System.out.println(n.toUpperCase()));

        String name2= name.map((x)-> x.toUpperCase()).orElse("No name is ther ");

        name.filter((n)->n.startsWith("P")).ifPresent((x)-> System.out.println(x));


    }


    public Optional<String> getName(){

        String name = "Puru";
        return Optional.ofNullable(name);
    }
}
