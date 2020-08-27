package com.sneha.di;

public class Student {
	
	
	private int id;
	private String stdName;
	
	//CONSTRUCTOR INJECTION
	public Student(int id, String stdName) {
		this.id = id;
		this.stdName = stdName;
	}
	public Student(int id) {
		super();
		this.id = id;
	}

	
	/*SETTER INJECTION
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setStdName(String stdName)
	{
		this.stdName = stdName;
	}*/
	
	

	public void displayStudentInfo()
	{
		System.out.println("Student name is : " + stdName +"\r"
				+ "Student id is : "+ id);
	}

}
