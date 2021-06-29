package com.cybertek.lambdaShortVideos.consumerImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> doublePrinter = t -> System.out.println(t + " || " + t);

        doublePrinter.accept("apple");
        doublePrinter.accept("oracle");

        List<String> names = new ArrayList<>(Arrays.asList("James", "John", "Alexander", "Diana", "Jonathan"));

        names.forEach(doublePrinter);

        names.forEach(each -> System.out.println(each + " & " + each + " & " + each));


    }
}

