package Septe15;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements u want to store:");
		int n=sc.nextInt();
		//n is an size of array which user will decide
		int []arr=new int[n];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
