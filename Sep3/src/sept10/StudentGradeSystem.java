package sept10;

import java.util.Scanner;

public class StudentGradeSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number:");
		int rno=sc.nextInt();
		System.out.println("Enter Student name:");
		String studentName=sc.next();
		System.out.println("Enter Student age:");
		int age=sc.nextInt();
		System.out.println("Enter marks for m1:");
		int m1=sc.nextInt();
		System.out.println("Enter marks for m2:");
		int m2=sc.nextInt();
		System.out.println("Enter marks for m3:");
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println("Student Roll no:"+rno);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student total marks:"+total);
		System.out.println("Student Average:"+avg);
		
		
		if(avg>=90) {
			System.out.println("A Grade");
			
		}
		else if (avg>=75) {
			System.out.println("B Grade");
			
		}
		
		else if (avg>=50) {
			System.out.println("C Grade");
			
		} 
		
		else if (avg>=35) {
			System.out.println("D Grade");
		}
		
		else {
			System.out.println("Congratulation you are fail!!!!");
		}
	}

}
