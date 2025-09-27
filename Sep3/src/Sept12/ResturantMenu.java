package Sept12;

import java.util.Scanner;

public class ResturantMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String mName=sc.next();
		System.out.println("Enter resturant name:");
		String rName=sc.next();
		System.out.println("Enter Menu prise:");
		int prise=sc.nextInt();
		System.out.println("Enter type of vegetables:");
		String mType=sc.next();
		System.out.println("Enter quantity:");
		int qty=sc.nextInt();
		int ch;
		do {
			
			System.out.println("Welcome to Resturant");
			System.out.println("Press 1-Details");
			System.out.println("Press 2-Calculate Bill");
			System.out.println("Press 3-Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
		
			switch(ch) {
			case 1:
				System.out.println("Restaurant details are:");
				System.out.println("Name:" +rName+"\nMenu Type:"+mType+"\nMenu name:"+mName+"\nMenu prise:"+prise+"\nMenu Quantity:"+qty);
			    break;
			case 2:
				System.out.println("Total Bill="+(qty*prise));
				break;
			case 3:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Wrong choice!!!");
			}
			
		}while(ch!=3);

	}

}
