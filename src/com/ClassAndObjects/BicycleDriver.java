package com.ClassAndObjects;

public class BicycleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle sportsCycle = new Bicycle();
		System.out.println("No. of gear in sports cycle is" + sportsCycle);
		sportsCycle.braking();
		
		Bicycle touringCycle = new Bicycle(6, true);
		System.out.println("No.of gear in touring cycle is.."+touringCycle);
		touringCycle.braking();
	}

}
