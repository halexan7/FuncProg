package com.learnJava.lamdasinaction.flatMapExample;

import com.learnJava.lamdasinaction.chap4.*;
import com.learnJava.data.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    static List<List<Student>> mainList = StudentDataBase.mainList;


    public static void main(String[] args) {
        List<List<String>> newOne = mainList.stream()
                .map(x -> {return x.stream()
                    .map(Student::getName).collect(Collectors.toList());})
                .collect(Collectors.toList());

        System.out.println(newOne);
    }
}
