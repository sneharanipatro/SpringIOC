package com.sneha.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("C")
	private String course;
	@Value("Surfing")
	private String hobby;

	public void displayStudentInfo() {

		System.out.println("Student Name " + name);
		System.out.println("Student Course " + course);
		System.out.println("Student Hobby " + hobby);

	}

}
