package sept10;

import java.util.Scanner;

public class MonthsManagementsystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the months lies in between 1-12:");
		int Month=sc.nextInt();
		if (Month==1) {
			System.out.println("January");
		}
		else if (Month==2) {
			System.out.println("febuary");
		}
		else if (Month==3) {
			System.out.println("March");
		}
		else if (Month==4) {
			System.out.println("April");
			
		}
		else if (Month==5) {
			System.out.println("May");
		}
		else if (Month==6) {
			System.out.println("June");
		}
		else if (Month==7) {
			System.out.println("July");
		}
		else if (Month==8) {
			System.out.println("August");
		}
		else if (Month==9) {
			System.out.println("September");
		}
		else if (Month==10) {
			System.out.println("Octomber");
		}
		else if (Month==11) {
			System.out.println("November");
		}
		else if (Month==12) {
			System.out.println("December");
		}
		else {
			System.out.println("Wrong Number");
		}
	}
}