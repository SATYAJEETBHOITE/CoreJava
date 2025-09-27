package sept10;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Id:");
		int pid=sc.nextInt();
		
		System.out.println("Enter product name:");
		String pname=sc.next();
		System.out.println("Enter product prise:");
		int prise=sc.nextInt();
		
		System.out.println("Enter product quantity:");
		int quantity=sc.nextInt();
		System.out.println("***Product Information:***");
		System.out.println("Product Id:"+pid+"\nProduct name:"+pname+"\nProduct Prise:"+prise+"\nProduct quantity:"+quantity);
	}

}
