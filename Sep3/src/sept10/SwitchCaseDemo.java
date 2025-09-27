package sept10;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1:");
		int no1=sc.nextInt();
		System.out.println("Enter No2:");
		int no2=sc.nextInt();
		
		System.out.println("Press1:Addition\nPress2:Substraction\nPress3:Multiplicatioln\nPress4:Division\nPress5:Reminder");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Addition:"+(no1+no2));
		break;
		case 2:
		System.out.println("Substration:"+(no1-no2));
		break;
		case 3:
		System.out.println("Multiplication:"+(no1*no2));
		break;
		case 4:
		System.out.println("Division:"+(no1/no2));
		break;
		case 5:
		System.out.println("Reminder:"+(no1%no2));
		default:
			System.out.println("Wrong Choice");
		
		
		}

	}

}
