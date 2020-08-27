package com.sneha.diot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		/*Student s=new Student();
		MathCheat cheat=new MathCheat();            ----------->internally happens
		s.setM(cheat);
		s.cheating();*/
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml file loaded");
		Student s=context.getBean("stu",Student.class);
		s.cheating();
		AnotherStudent as=context.getBean("nothr",AnotherStudent.class);
		as.startCheating();
		

	}

}
