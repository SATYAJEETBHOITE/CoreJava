package sept8;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String pname=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Person Name:"+pname+"\nperson Age:"+age);
		if(age>=18) {
			System.out.println("Eligible for voting");
			
		}
		else {
			System.out.println("Not eligible for voting because age is below 18");
		}
		

	}

}
