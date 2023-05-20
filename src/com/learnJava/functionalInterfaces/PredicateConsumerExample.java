package com.learnJava.functionalInterfaces;
import java.util.function.*;
import java.util.*;
import com.learnJava.data.*;

public class PredicateConsumerExample {
    static Predicate<Student> p1 = s -> s.getActivities().contains("soccer");
    static List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args){
        students.forEach(x -> {
            if(p1.test(x)){
                System.out.println(x.getName() + " likes soccer.");
            }
        });
    }
}
