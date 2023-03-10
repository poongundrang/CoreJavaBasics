package ControlFlowStatements;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,4,12};
		int s=1,i=-1,i1;
		for(i1=0;i1<a.length;i1++)
		{
			if(a[i1]==s)
			{
				i=1;
				break;
			}
		}
		if(i!=1)
		{
			System.out.println("the value found at "+i1);
		}
		else {
			System.out.println("Not found");
		}
	}

}
