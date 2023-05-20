package com.learnJava.functionalInterfaces;

import java.util.function.*;
import java.util.*;

public class PredicateExample {
    static Predicate<Integer> p1 = x -> x % 2 == 0;
    static Predicate<Integer> p2 = x -> x % 5 == 0;
    static Predicate<Integer> p3 = x -> x % 2 == 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        Predicate<String> predicate = x -> x.startsWith("He");
        System.out.println(predicate.test(scanner.nextLine()));*/

        System.out.println(p1.and(p2).test(10));

    }
}
