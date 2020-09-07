package com.sneha.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component("clgBean") //create a bean
public class College {
	@Value("Oxford")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;
	
	/*public College(Principal principal) {
		this.principal = principal;
	}

	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("this z setter injection");
	}*/

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My ");
		System.out.println("Testing the called method");
		
	}

}
