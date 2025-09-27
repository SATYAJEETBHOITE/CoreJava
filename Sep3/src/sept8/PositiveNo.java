package sept8;

import java.util.Scanner;

public class PositiveNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		
		
		if (a>0) {
			System.out.println("Positive number");
		}
		 else {
				System.out.println("Negative number");
			}
	}

}
