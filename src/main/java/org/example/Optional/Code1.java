package org.example.Optional;

public class Code1 {

    public static void main(String[] args) {

        Code1 obj=new Code1();

        //Option 1 --> Without optional

        String name = obj.getNamewithoutOptional().toUpperCase();
        System.out.println(name);

        String name2= obj.getNameWithOptional().toUpperCase();
        System.out.println(name2);
    }

    //Option 1 without Optional
    public String getNamewithoutOptional(){

        return "Purushattom Banerjee";
    }

    //Option 2 with Optional

    public String getNameWithOptional()
    {
        return null;
    }



}
