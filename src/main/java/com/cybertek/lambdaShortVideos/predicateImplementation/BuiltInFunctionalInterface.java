package com.cybertek.lambdaShortVideos.predicateImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInFunctionalInterface {
    public static void main(String[] args) {

        Predicate<String> moreThan5Char= t-> t.length()>5;


        List<String> names = new ArrayList<>(Arrays.asList("James","John","Alexander","Diana","Jonathan"));

        names.removeIf(moreThan5Char);

        System.out.println(names);

    }
}
