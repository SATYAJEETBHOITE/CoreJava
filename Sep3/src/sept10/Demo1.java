package sept10;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int x=sc.nextInt();
		//if block execute true condition
		if(x%2==0) {
			System.out.println("Even number");
		}
	}

}
