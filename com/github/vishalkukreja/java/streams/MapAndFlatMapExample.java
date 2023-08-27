package com.github.vishalkukreja.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.github.vishalkukreja.java.functionalprogramming.Instructor;
import com.github.vishalkukreja.java.functionalprogramming.Instructors;

public class MapAndFlatMapExample {
	public static void main(String[] args) {
		
		//map example
		List<String> instructors = Instructors.getAll().stream()
									.map(Instructor::getname)
									.map(String::toUpperCase)
									.collect(Collectors.toList());
		System.out.println(instructors);
		
		//flatmap example
		List<String> instructorCourses = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(instructorCourses);
	}

}
