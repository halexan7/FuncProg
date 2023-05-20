package com.learnJava.functionalInterfaces;

import java.util.function.*;
import java.util.*;

public class BiConsumerExample {
    public static void main(String[] args){
        BiConsumer<Integer, Integer> biConsumer =
                (a,b) -> System.out.println(a * b);

        biConsumer.accept(5, 9);

    }
}
