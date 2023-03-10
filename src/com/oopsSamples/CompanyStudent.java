package com.oopsSamples;

public class CompanyStudent extends Student { 
	String companyName;
	public CompanyStudent(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}
	public void goToClass() {
		System.out.println("Goto class after evalu.. "+ this.name);
	}
	public String toString() {
		String str = "Company student name is "+this.name;
		return str;
		//System.out.println("Object of s5 is.. "+s5.toString());
	}
}
