package com.ClassAndObjects;

public class Kid {
	
	static String studyClass ="KinderGarden";
	String name;
	int age;
	
	public Kid(String name , int age) {
		this.name = name;
		this.age = age;
	}
	public void play() {
		System.out.println(this.name +" is playing..");
		//printKid(this.name);
	}
public void printKid()
{
	System.out.println("Name of kid is: "+this.name +"Age is :" + this.age);
}
public void printKid(int studying)
{
	System.out.println("kid is studying in : "+ studying);
}
public void printKid(String name, int age)
{
	System.out.println("kid is studying in : ");
}
/*public void printKid(Date dob) {
	
}*/
}
