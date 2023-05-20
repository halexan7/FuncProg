package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(x -> System.out.println(x));
    }


    public static void main(String[] args){
        List<Student> example = StudentDataBase.getAllStudents();
        Optional<Student> student = example.stream()
                .filter(x-> x.getActivities().contains("Basketball"))
                .findFirst();
        System.out.println(student);
    }
}
