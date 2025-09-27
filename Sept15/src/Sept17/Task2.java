package Sept17;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String uname=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		if (uname.equals(pass)&&(pass.equals(uname))) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
