package Sept11;

import java.util.Scanner;

public class MenuDrivenApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		int no1=sc.nextInt();
		System.out.println("Enter no2:");
		int no2=sc.nextInt();
		int choice;
		
		do {
			System.out.println("Press1-Addition");
			System.out.println("Press2-Substration");
			System.out.println("Press3-Multiplication");
			System.out.println("Press4-Division");
			System.out.println("Press5-Reminder");
			System.out.println("Press6-Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice) 
			{
			
			case 1:
				System.out.println("Addition:"+(no1+no2));
			break;
			case 2:
				System.out.println("Substraction:"+(no1-no2));
			break;
			case 3:
				System.out.println("Multiplication:"+(no1*no2));
			break;
			case 4:
				System.out.println("Division:"+(no1/no2));
			break;
			case 5:
				System.out.println("Reminder:"+(no1%no2));
			break;
			case 6:
				System.out.println("Exit");
			break;
			default:
				System.out.println("Wrong choice!!!");
			}
		
		}while(choice!=6);

	}

}
