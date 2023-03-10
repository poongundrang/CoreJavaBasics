package com.ClassAndObjects;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strOne = "Java ";
		strOne = strOne + "Programming";
		System.out.println("Value of strOne:" +strOne.hashCode());
		strOne = strOne.concat(" Language");
		
		System.out.println("Value of strOne: "+ strOne);
	    String strTwo = new String (" Functional programming");
	  
	    //String strTwo = new String ("Functional Programming");
	    
	    System.out.println("Value of strTwo:" +strTwo.hashCode());
	    strTwo = strTwo.concat(" Language");
		
	  
	    System.out.println(strTwo.length());
	    System.out.println(strTwo.substring(10).trim().toUpperCase());
	    System.out.println(strTwo.trim());
	    
	    System.out.println("Value of strTwo:" + strTwo);
	}

}
