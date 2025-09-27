package Sept16;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		System.out.println("Enter column size:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
