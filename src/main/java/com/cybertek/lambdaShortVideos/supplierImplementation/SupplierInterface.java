package com.cybertek.lambdaShortVideos.supplierImplementation;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<String> providedString = () -> "Your String";
        System.out.println("providedString.get() = " + providedString.get());

        Supplier<Integer> randomNumber =() -> new Random().nextInt(151);
        System.out.println(randomNumber.get());

        Supplier<Person> personProvider = ()-> new Person("Michael Jordan", 35);
        System.out.println(personProvider.get());

    }
}
