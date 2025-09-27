package sept10;

import java.util.Scanner;

public class Student {
	int rNo;
	String sname;
	int maths;
	int Sci;
	int english;

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number:");
		s.rNo=sc.nextInt();
		System.out.println("Enter Student Name:");
		s.sname=sc.next();
		System.out.println("Enetr Marks of maths:");
		s.maths=sc.nextInt();
		System.out.println("Enetr Marks for science:");
		s.Sci=sc.nextInt();
		System.out.println("Enter Marks for english:");
		s.english=sc.nextInt();
		int total=s.maths+s.Sci+s.english;
		double percentage=total/3;
		System.out.println("Student Roll no:"+s.rNo+"\nEnter student name:"+s.sname+"\nTotal Marks:"+total+"\nPercentage:"+percentage);

}
}
