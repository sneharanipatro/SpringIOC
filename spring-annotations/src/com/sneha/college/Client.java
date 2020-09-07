package com.sneha.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College clg = context.getBean("clgBean", College.class);
		System.out.println("The College Object is Created"+clg);
		clg.test();
		context.close();

	}

}
