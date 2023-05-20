package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import java.util.*;
import java.util.function.*;

public class PredicateStudentExample {
    static Consumer<Predicate<Student>> c1 = x -> System.out.println(x);
    static Predicate<Student> p2 = s -> s.getGpa()>=3.9;
    static Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
    static List<Student> students = StudentDataBase.getAllStudents();

    public static void main(String[] args){
        students.forEach(x -> {
            if(p1.and(p2).test(x)){
                System.out.println(x);
            }
        });


    }
}
