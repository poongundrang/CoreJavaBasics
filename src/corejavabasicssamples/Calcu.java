package corejavabasicssamples;

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		static int c;
		int a;
		final double pi=3.14;
		public void add(int a, int b) {
			
		
		
		
		
		System.out.println("Value of a ..."+ a++);
		System.out.println("Value of a ..."+ a);
		
		System.out.println("Value of b ..."+ ++b);
		a=a+1;
		a+=1;
		int sum;
		sum = a+b;
		System.out.println(a+b);
		}
		public void area(double radius) {
			double area = pi*radius*radius;
		}
		public static void main(String[] args) {
			Calcu calobj = new Calcu();
			calObj.add(10,25);
			calObj.number = 10;
			c=15;
		}
	}

}
