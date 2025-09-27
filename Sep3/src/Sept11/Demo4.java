package Sept11;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no u want to add:");
		int n=sc.nextInt();
		
		int sum=0;
		
		int i=1;
		while(i<=n) {
			sum = sum+i;
			i++;
		}
		System.out.println("Sum is:"+sum);
		

	}

}
