package com.oopsSamples;

public abstract class Student {
	
	String name;
	String address;
	float gpa;
	
	public Student(String name) {
		this.name = name;
	}
	
	/*public Student(float gpa) {
		this.name =name;
		this.gpa = gpa;
	}*/
	public Student() {
		
	}
	public void goToClass() {
		System.out.println("Student go to classes " + this.name);
		
	}
	//public abstract void goToClass();
	

}
