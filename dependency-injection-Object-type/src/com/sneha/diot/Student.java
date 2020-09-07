package com.sneha.diot;

public class Student {
	
	private MathCheat m;
	private int id;
	
	//SETTER INJECTION
	public void setId(int id) {
		this.id = id;
	}

	public void setM(MathCheat m) {
		this.m = m;
	}

	public void cheating()
	{
		m.mathCheat();
		System.out.println("Hey my id is "+id+" IDC");
	}

}
