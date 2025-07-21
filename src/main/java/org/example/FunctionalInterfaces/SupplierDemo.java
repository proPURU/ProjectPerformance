package org.example.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

                Supplier<Integer> supplier1=new Supplier<Integer>() {
                    @Override
                    public Integer get() {
                        return 20 ;
                    }
                };

                Supplier<Integer> supplier=()-> 5;

                System.out.println(supplier.get());

            }
        }
