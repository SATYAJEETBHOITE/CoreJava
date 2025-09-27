package Sept11;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number:");
		String accNo=sc.next();
		System.out.println("Enter account holder name:");
		String accHolderName=sc.next();
		System.out.println("Enter current balance:");
		double balance=sc.nextDouble();
		int amt;
		int ch;
		
		do {
			System.out.println("***Welcome To Banking System");
			System.out.println("Press1-Display Account Details:");
			System.out.println("Press2-Deposite Money");
			System.out.println("Press3-Withdraw Money");
			System.out.println("Press4-Exit");
			System.out.println("Enter choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Account Details");
				System.out.println("Account Number:"+accNo+"\nAccount Holder Name:"+accHolderName+"\nAccount Current Balance:"+balance);
				break;
			case 2:
				System.out.println("Enter how much amount u want to Deposite??");
				amt=sc.nextInt();
				//balance=balance+amt;
				balance+=amt;
				System.out.println("After Depositing balance is:"+balance);
				break;
			case 3:
				System.out.println("Enter how much amount u want to withdraw??");
				amt=sc.nextInt();
				balance-=amt;
				System.out.println("After withdraw balance is:"+balance);
				break;
				
			case 4:
				System.out.println("Closing Banking App");
				break;
				default:
					System.out.println("Wrong choice");
		
			}
		}while(ch!=4);
		

	}

}
