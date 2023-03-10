package corejavabasicssamples;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create variables

		int a = 7, b = 1;
		// value of a and b

		System.out.println("a is " + a + " and b is " + b);
		// == operator

		System.out.println(a == b);
		// false         // != operator

	 System.out.println(a != b);
	 // true         // > operator

	System.out.println(a > b);
	// false         // < operator

		System.out.println(a < b);
		// true         // >= operator

		System.out.println(a >= b);
		// false         // <= operator

		System.out.println(a <= b);
		// true     // && operator

		System.out.println((5 > 3) && (8 > 5)); 
		// true

		System.out.println((5 > 3) && (8 < 5));
		// false     // || operator

		System.out.println((5 < 3) || (8 > 5)); 
        // true

		System.out.println((5 < 3) || (8 > 5));
		// true

		System.out.println((5 < 3) || (8 < 5));
		// false     // ! operator

	    System.out.println(!(5 == 3));
	    // true

		System.out.println(!(5 > 3));
		// false

	}

}
