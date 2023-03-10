package com.ClassAndObjects;

public class StringSamplesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String type = "Java programming";
		
		String first = "Java is object oriented programming";
		String two = "Py";
		String three = "Language";
		
		System.out.println(first);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println("Length of the string .."+first.length());
		
		String joinedString = first.concat(three);
		System.out.println("Joined string is..."+joinedString);
		
		first = "Java programming";
		two = "Java programming";
		three = "Py programming";
		
		boolean result1 = first.equals(two);
		System.out.println("Strings first and second are equal: " +result1);
		
		boolean result2 = first.equals(three);
		System.out.println("Strings first and third are equal: " +result2);
		
		String example = "Hello";
		example = example.concat("Welcome");
		
		String newString = new String("Java program");
		System.out.println("Value of newString.."+newString);
		
			
		
		
		
	}

}
