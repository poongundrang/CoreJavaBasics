package corejavabasicssamples;

public class TernaryOperatorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the year
		/*int year = 2020;
	    String result;

	    // divisible by 4, not by 100, or divisible by 400
	    result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "is a leap year" : "is not a leap year";

	    System.out.println(year + " " + result + ".");*/
		//Using Feb days
		int februaryDays = 29;
		String result;
		//int interest;
		result = (februaryDays == 28)?"Not a leap year" : "Leap year";
		System.out.println(result);
		

	}

}
