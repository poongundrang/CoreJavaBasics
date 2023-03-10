package corejavabasicssamples;

import java.util.Scanner;
public class ConsoleInSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		
		System.out.print("Enter an float: ");
		float myFloat = input.nextFloat();
		System.out.println("Float entered " + myFloat);
		
		System.out.print("Enter an Double: ");
		double myDouble = input.nextDouble();
		System.out.println("Double entered " + myDouble);
		
		System.out.print("Enter an text: ");
		String myString = input.next();
		System.out.println("Text entered " + myString);
		
		input.close();
	}

}
