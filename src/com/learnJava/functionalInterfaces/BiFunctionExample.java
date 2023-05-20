package com.learnJava.functionalInterfaces;

import java.util.*;
import java.util.function.*;

public class BiFunctionExample {

    static BiFunction<Integer, Integer, String> b1 = (x,y) ->
            String.valueOf(x + y);

    public static void main(String[] args) {

        System.out.println(b1.apply(5,7));
    }
}
