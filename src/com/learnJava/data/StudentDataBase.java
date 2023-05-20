package com.learnJava.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.learnJava.data.*;

public class StudentDataBase {

    static Student s1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
    static Student s2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
    static Student s3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
    public static List<Student> list1 = Arrays.asList(s1,s2,s3);

    static Student s4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
    static Student s5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
    static Student s6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));
    public static List<Student> list2 = Arrays.asList(s4,s5,s6);

    public static List<List<Student>> mainList = List.of(list1, list2);

    public static void main(String[] args) {
        list1.forEach(x -> System.out.println(x.getName()));
    }


    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
