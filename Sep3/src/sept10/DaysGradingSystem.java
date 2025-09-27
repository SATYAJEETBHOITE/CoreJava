package sept10;

import java.util.Scanner;

public class DaysGradingSystem {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter days in between 1-7");
		 
		 int days=sc.nextInt();
		 
		 if(days==1) {
			 System.out.println("Monday");
		 }
		 else if(days==2) {
			 System.out.println("Tuesday");
			 
		 }
		 else if (days==3) {
			 System.out.println("Wednesday");
			 
		 }
		 else if(days==4) {
			 System.out.println("Thursday");
			 
		 }
		 else if(days==5) {
			System.out.println("Friday");
				
			}
		 else if (days==6) {
			 System.out.println("Saturday");
		 }
		 else if (days==7) {
			 System.out.println("Sunday");
		 }
		 else {
			 System.out.println("Wrong Choice");
		 }
		 
		 }
	}


