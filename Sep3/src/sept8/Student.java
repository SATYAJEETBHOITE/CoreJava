package sept8;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Roll no:");
		int rno=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String name=sc.next();
		System.out.println("Enter Student age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Marks for Maths:");
		int maths=sc.nextInt();
		System.out.println("Enter Marks for science:");
		int sci=sc.nextInt();
		System.out.println("Enter Marks for English:");
		int english=sc.nextInt();
		int total=maths+sci+english;
		double percentage=total/3;
		System.out.println("Student Roll no:"+rno+"\nStudent Name:"+name+"\nAge:"+age+"\nTotal Marks:"+total+"\nPercentage:"+percentage);

		

	}

}
