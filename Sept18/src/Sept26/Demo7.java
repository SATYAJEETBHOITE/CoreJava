package Sept26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo7 {
	static void checkage() throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int no=sc.nextInt();
		try {
		if(no<0) {
			throw new AgeException("number is negative");
		}
		else {
			System.out.println("age is enetered in positive");
		}
	}catch(InputMismatchException i) {
		i.printStackTrace();
	}
	}

	public static void main(String[] args) throws AgeException {
		try {
			checkage();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
