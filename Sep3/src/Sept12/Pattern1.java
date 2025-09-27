package Sept12;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
		for(int space=0;space<n-row;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
