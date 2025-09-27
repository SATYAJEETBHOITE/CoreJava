package Sept20;

import java.util.Scanner;

class Menu{
	int menuid;
	String menuName;
	int prise;
	int quantity;
	static Scanner s=new Scanner(System.in);
	void MenuDetails() {
		System.out.println("Enter menu id:");
		menuid=s.nextInt();
		System.out.println("Enter menu name:");
		menuName=s.next();
		System.out.println("Enter menu prise:");
		prise=s.nextInt();
		System.out.println("Enter menu quantity:");
		quantity=s.nextInt();
		System.out.println("Menu id:"+menuid+"\nmenu name:"+menuName+"\nMenu prise:"+prise+"\nMenu quantity:"+quantity);
	}
	void calculateBill() {
		int total=prise*quantity;
		System.out.println("Bill is:"+total);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		Menu m=new Menu();
		m.MenuDetails();
		m.calculateBill();
		

	}

}
