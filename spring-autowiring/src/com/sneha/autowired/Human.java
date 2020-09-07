package com.sneha.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;

	public Human() {
	}
	//@Autowired

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constructor z getting called");
	}
	
	@Autowired
	@Qualifier("humanheart")

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	public void startPumping() {
		if (heart != null)
		{
			heart.pump();
		System.out.println("Name of the animal is : "+ heart.getNameOfAnimal()+" no of heart present : "+heart.getNoOfHeart());
		}
		else
			System.out.println("u r dead");
	}

}
