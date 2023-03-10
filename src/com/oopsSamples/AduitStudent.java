package com.oopsSamples;

public class AduitStudent extends Student {
	String name;
	String Location;
	public AduitStudent(String name,String Location) {
		this.name = name;
		this.Location = Location;
	}
	public void goToClass() {
		//super.goToClass();
		System.out.println("Go to the specified auditorium no.1.. "+this.Location);
	}
	public String toString() {
		String strObj = "Audit student name is "+this.name;
		return strObj;
		//System.out.println("Object of s5 is.. "+s5.toString());
	}
}
