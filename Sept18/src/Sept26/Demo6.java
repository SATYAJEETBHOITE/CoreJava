package Sept26;
import java.util.InputMismatchException;

import java.util.Scanner;


/*Scenario 2: User Input Validation
Problem: You are developing a calculator application that takes two numbers as input from the user and performs division. How would you handle the case where the user enters non-numeric input or attempts to divide by zero?
Consider: InputMismatchException, ArithmeticException.
Problem: You need to prompt the user for an age, and it must be a positive integer. How would you handle cases where the user enters a negative number or text, and how would you re-prompt for valid input?
*/
public class Demo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter no1:");
			int no1=sc.nextInt();
			System.out.println("Enter no2:");
			int no2=sc.nextInt();
			int result=no1/no2;
			
			if (no2==0) {
				throw new ArithmeticException("we can not divide by zero");
				
			}
			else {
				System.out.println("Result is:"+result);
			}
		}
		catch(InputMismatchException i) {
			i.printStackTrace();
		}

	}

}
