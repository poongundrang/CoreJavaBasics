package com.oopsSamples;

public class PayingStudent extends Student{
	
	boolean madePayment;
	public PayingStudent(String name, float gpa) {
		
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	public void goToClass() {
		System.out.println("Paying student go to next class "+this.name);
		
	}
	public String toString() {
		String str1 = "Paying student name is "+this.name;
		return str1;
		//System.out.println("Object of s5 is.. "+s5.toString());
	}
	
}
