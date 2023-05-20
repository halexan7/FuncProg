package com.learnJava.functionalInterfaces;
import java.util.function.*;
import java.util.*;
import com.learnJava.data.*;

public class BiPredicateExample {

    static BiPredicate<String,Integer> b1 =
            (gender, grade) -> gender == "female" && grade >= 3;

    public static void main(String[] args){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(x -> {
            if(b1.test(x.getGender(), x.getGradeLevel())){
                System.out.println(x);
            }
        });
    }
}
