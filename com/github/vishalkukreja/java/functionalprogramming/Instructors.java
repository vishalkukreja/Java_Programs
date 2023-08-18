package com.github.vishalkukreja.java.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Manish", 10, "Software Developer"
         , "M", true, Arrays.asList("Java Programming", "C Programming", "PHP Programming"));

        Instructor instructor2 = new Instructor("Kunal", 5, "Java Developer"
                , "F", false, Arrays.asList("Multi-Threaded Programming", "Java Programming", "Unit Testing"));

        Instructor instructor3 = new Instructor("Ajay", 6, "Test Manager"
                , "M", false, Arrays.asList("Java Programming", "Automation testing", "Selinium"));

        Instructor instructor4 = new Instructor("Rahul", 12, "Senior Developer"
                , "M", true, Arrays.asList("Java Programming", "Angular Programming", "React"));

        Instructor instructor5 = new Instructor("Vishal", 15, "Principal Engineer"
                , "M", true, Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "Angular"));

        List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
        return list;

    }
}