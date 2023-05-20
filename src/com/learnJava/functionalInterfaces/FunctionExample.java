package com.learnJava.functionalInterfaces;
import java.util.function.*;
import java.util.*;
import com.learnJava.data.*;

public class FunctionExample {

    static Function<String, Integer> fun1 = x -> Integer.parseInt(x);

    public static void main(String[] args){
        fun1.apply("256");
    }
}
