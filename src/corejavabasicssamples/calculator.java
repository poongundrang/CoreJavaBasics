package corejavabasicssamples;

public class calculator {
	//instant variable
	int num;
	//class variable
	static int c;
	//a,b are parameters
	public static void add(int a , int b) {
		//local variable
		int sum;
		sum = a+b;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calObj = new calculator();
		calObj.add(39,43);
		calObj.num = 55;
		c = 15;
		

	}

}
