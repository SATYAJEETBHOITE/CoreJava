package sept10;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User Account holder name:");
		String sname=s.next();
		System.out.println("Enetr Account Balance:");
		double balance=s.nextDouble();
		System.out.println("Enter how much amount u want to withdraw:");
		int amount=s.nextInt();
		if(amount<balance) {
			balance-=amount;
			System.out.println("Current balance:"+balance);
		}
		else {
			System.out.println("Oops!!!Transaction Declain due to insufficient balance");
			
		}
	}

}
