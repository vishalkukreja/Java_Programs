 package com.github.vishalkukreja.java.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		
		//iterate
		Consumer<Instructor> con1 = (con) -> System.out.println(con);
		instructors.forEach(con1); 
		
		Consumer<Instructor> conName = (con) -> System.out.println(con.getname());
		instructors.forEach(conName);
		
		Consumer<Instructor> conCourse = (con) -> System.out.println(con.getCourses());
		instructors.forEach(conName.andThen(conCourse));
		
		instructors.forEach(ins -> {
			if(ins.getExperience() > 5) {
				con1.accept(ins);
			}
		});
	}
}
