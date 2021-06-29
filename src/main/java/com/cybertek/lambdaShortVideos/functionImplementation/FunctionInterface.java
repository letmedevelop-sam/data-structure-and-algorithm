package com.cybertek.lambdaShortVideos.functionImplementation;

import com.cybertek.lambdaShortVideos.supplierImplementation.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterface {
    public static void main(String[] args) {

        Function<String,Integer> lengthGetterr = new StringLengthGetter();
        System.out.println("lengthGetterr.apply(\"ABC\") = " + lengthGetterr.apply("ABC"));

        Function<String,Integer> lengthGetter=  str -> str.length();
        System.out.println(lengthGetter.apply("apple"));

        Function<String,String> doubleStr = str-> str + " - " + str;
        System.out.println(doubleStr.apply("java"));

        Function<Person,Integer> personBirthYearGetter = person -> 2020 - person.getAge();
        System.out.println(personBirthYearGetter.apply(new Person("Mike",40)));

        List<String> names = new ArrayList<>(Arrays.asList("James","John","Alexander","Diana","Jonathan"));

        List<Integer> lengthList = new ArrayList<>();

        for (String name : names) {
            lengthList.add(lengthGetter.apply(name));
        }

        System.out.println(lengthList);


        System.out.println("===========================compareInterface=====================");

        Comparator<String> lastCharCom = //((o1, o2) -> o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1)))
                Comparator.comparing(str->str.substring(1,2));
                // ;

        names.sort(lastCharCom);

        for (String name : names) {
            System.out.println("each item : " + name);
        }

        UnaryOperator<String> unary = str->str.substring(2,3);
        names.sort(Comparator.comparing(unary));

        System.out.println(names);

        names.replaceAll(str-> str + str);

        System.out.println(names);

    }
}
