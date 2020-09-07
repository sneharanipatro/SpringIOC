package com.sneha.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.sneha.college")
public class CollegeConfig {
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean // create a bean,in this way of creation we don't need @ComponentScan
	public College clgBean() {
		// College clg = new College(principalBean());
		College clg = new College();
		//clg.setPrincipal(principalBean());
		//clg.setTeacher(mathTeacherBean());
		return clg;
	}

}
