package com.sneha.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hey there!");

	}

}
