package Sept11;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines of pyramid u want to draw:");
		
		int n=sc.nextInt();//5
		//i-row,j=col
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

}
	
}
