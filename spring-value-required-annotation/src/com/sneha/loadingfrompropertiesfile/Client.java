package com.sneha.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml file loaded");
		Student s=context.getBean("student",Student.class);
		System.out.println(s);
		s.displayStudentInfo();
		

	}

}
