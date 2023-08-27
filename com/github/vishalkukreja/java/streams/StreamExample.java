package com.github.vishalkukreja.java.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.github.vishalkukreja.java.functionalprogramming.Instructor;
import com.github.vishalkukreja.java.functionalprogramming.Instructors;

public class StreamExample {
	public static void main(String[] args) {
		Predicate<Instructor> pre1 = (i) -> i.isOnlineClass();
		Predicate<Instructor> pre2 = (i) -> i.getExperience() > 10;
		
		List<Instructor> list = Instructors.getAll();
		Map<String, List<String>> map = list.stream().filter(pre1).filter(pre2)
									.collect(Collectors.toMap(Instructor::getname, Instructor::getCourses));
		System.out.println(map);
	}
}
