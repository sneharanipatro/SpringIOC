package com.sneha.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		/*SETTER INJECTION
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean("std",Student.class);
		s.displayStudentInfo();
		
		Student s1=context.getBean("x",Student.class);
		s1.displayStudentInfo();
		*/
		
		//CONSTRUCTOR INJECTION
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean("std",Student.class);
		s.displayStudentInfo();
		Student s1=context.getBean("x",Student.class);
		s1.displayStudentInfo();

	}

}
