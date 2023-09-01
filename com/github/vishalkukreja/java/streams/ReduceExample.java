package com.github.vishalkukreja.java.streams;

import java.util.Arrays;
import java.util.Optional;

import com.github.vishalkukreja.java.functionalprogramming.Instructor;
import com.github.vishalkukreja.java.functionalprogramming.Instructors;

public class ReduceExample {
	public static void main(String[] args) {
		
		Optional<Integer> res = Arrays.asList(1,2,3,4,5).stream().reduce((v1, v2) -> v1 + v2);
		System.out.println(res.get());
		
		Optional<Instructor> ins =  Instructors.getAll().stream().
		reduce((s1,s2) ->
		s2.getExperience()>s1.getExperience()?s2:s1);
		System.out.println(ins);
	}
}
