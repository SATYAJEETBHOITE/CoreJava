package Spet15;

import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
			
				int ch;
				
				do {
					System.out.println("Press1-Check number is Even or Odd?");
					System.out.println("Press2-Check Largest number");
					System.out.println("Press3-Check number positive Or Negative?");
					System.out.println("Press4-Calculate Factorial");
					System.out.println("Press5-Exit");
					System.out.println("Enter choice:");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter no:");
						int a=sc.nextInt();
						if(a%2==0) {
							System.out.println("Even Number");
						}
						else {
							System.out.println("Odd Number");
						}
					break;
					case 2:
						System.out.println("Enter value for i:");
						int i=sc.nextInt();
						System.out.println("Enter value for j:");
						int j=sc.nextInt();
						System.out.println("Enter value for k:");
						int k=sc.nextInt();
						if(i>j && i>k) {
							System.out.println("i value is Largest");
						}
						else if(j>i &&j>k) {
							System.out.println("j value is Largest");
						}
						else {
							System.out.println("k value is Largest");
						}
					break;
					case 3:
						System.out.println("Enter value:");
						int c=sc.nextInt();
						if(c>0) {
							System.out.println("Entered number is positive");
						}
						else {
							System.out.println("Entered number is negative");
						}
						
						break;
						
					case 4:
						System.out.println("Enter number:");
						int n=sc.nextInt();
						int fact=1;
						for(int b=1;b<=n;b++) {
							//fact=fact*b;
							fact*=b;
							
						}
						System.out.println("Factorisl is:"+fact);
					break;
					case 5:
						System.out.println("Exit...");
					break;
					default:
						System.out.println("Wrong choice!!!");
					}
					
				}while(ch!=5);

			}

		

	}

	
