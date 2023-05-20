package com.learnJava.lamdasinaction.chap5;
import java.util.function.*;
import com.learnJava.lamdasinaction.chap4.Dish;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    static Predicate<Dish> veggie = Dish::isVegetarian;
    static String[] arrayOfWords = {"Hello", "World", "How", "Are", "You"};
    static String[] twoOfWords = {"This", "Is", "Number", "Two"};

    static List<String> one = Arrays.asList(arrayOfWords);
    static List<String> two = Arrays.asList(twoOfWords);
    static Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
    static List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);

    public static void main(String[] args) {
//        //distinct method
//        numbers.stream()
//                        .filter(x -> x % 2 ==0)
//                                .distinct()
//                                        .forEach(x -> System.out.print(x + " "));
//
//        //filter method
//        Dish.menu.stream()
//                .filter(veggie)
//                .forEach(x -> System.out.print(x + " "));
        List<String> newWords =
                streamOfWords.
                map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(newWords);
    }
}
