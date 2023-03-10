package IOStreaam;

import java.util.ArrayList;

import com.oopsSamples.AduitStudent;
import com.oopsSamples.CompanyStudent;
import com.oopsSamples.PayingStudent;
import com.oopsSamples.Student;


public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> stud = new ArrayList<>();
		//Student s1 = new Student("Man1");
		Student s1 = new PayingStudent("Arun",8.7f);
		Student s2 = new CompanyStudent("Aroon","Zuci");
		Student s3 = new AduitStudent("Bala","Zuci Systems");
		//Student s4 = new wStudent("Man4");
		Student s4 = new PayingStudent("Atman", 9.5f);
		Student s5 = new CompanyStudent("Man","Zuci");
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		System.out.println("Array List:\n "+stud);
		stud.remove(s3);
		System.out.println("After Removal Array List: "+stud);
		//Student[] studs;
		for(Student s:stud) {
			System.out.println(s);
		}

	}

}
