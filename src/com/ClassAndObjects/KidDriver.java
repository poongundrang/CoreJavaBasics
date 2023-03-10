package com.ClassAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		
	//  Kid kidOne = new Kid();
		Kid kidOne = new Kid("Pinky", 8);
		kidOne.play();
		Kid kidTwo = new Kid("Vickky", 10);
		System.out.println(kidTwo.name);
		
	//	System.out.println("kidOne..." + kidOne.hashCode());
	//  System.out.println("kidTwo..." + kidTwo.hashCode());
	//	kidOne = kidTwo;
	//  System.out.println("kidOne..." + kidOne.hashCode());
	//  System.out.println("kidOne..." + kidOne.name);
		
		kidTwo.play();
		kidTwo.printKid(10);
		System.out.println("All kids are in " +Kid.studyClass);
		
	//	EncapsulatedKid kid = new EncapsulatedKid();
	//	kid.setAge(10);
	}

}
