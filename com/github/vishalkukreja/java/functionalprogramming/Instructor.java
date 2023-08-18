package com.github.vishalkukreja.java.functionalprogramming;

import java.util.List;

public class Instructor {
	String name;
	int experience;
	String title;
	String gender;
	boolean onlineClass;
	List<String> courses;
	
	public Instructor(String name, int experience, String title, String gender, boolean onlineClass,
			List<String> courses) {
		super();
		this.name = name;
		this.experience = experience;
		this.title = title;
		this.gender = gender;
		this.onlineClass = onlineClass;
		this.courses = courses;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnlineClass() {
		return onlineClass;
	}

	public void setOnlineClass(boolean onlineClass) {
		this.onlineClass = onlineClass;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", experience=" + experience + ", title=" + title + ", gender=" + gender
				+ ", onlineClass=" + onlineClass + ", courses=" + courses + "]";
	}
	
	
}
