package com.learnJava.lambdas;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args){
        String one = "Hello";
        String two = "Different";

        Comparator<String> comp = (x,y) -> x.compareTo(y);

    }
}
