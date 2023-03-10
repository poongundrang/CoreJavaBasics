package com.ClassAndObjects;

public class Bicycle {

	int gear;
	boolean isRunning;
	
	public Bicycle() {
		this.gear = 5;
		this.isRunning = false;
		
	}
	public Bicycle(int gear , boolean isRunning) {
		this.gear = gear;
		this.isRunning = isRunning;
	}
	
	public void braking() {
		System.out.println("Brake is working");
	}
	void cycleStarted() {
		isRunning = true;
		System.out.println("Cycle started.."+isRunning);
		
	}
	void cycleStopped() {
		isRunning = false;
		System.out.println("Cycle stopped.."+isRunning);
		
	}
	public static void main(String arg[]) {
		Bicycle sportsCycle = new Bicycle();
		System.out.println("No.of gear in sports cycle is"+sportsCycle);
		sportsCycle.braking();
	}
	
	
}
