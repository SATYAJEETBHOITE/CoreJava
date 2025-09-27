package Sept20;
/*
 * Bank Account System
Create a base class Account with fields like accountNumber, balance and methods deposit(), withdraw().
Derive classes SavingsAccount and CurrentAccount.

SavingsAccount has an interest rate and method calculateInterest().

CurrentAccount has overdraft limit.
Demonstrate inheritance by creating objects of both subclasses.
 * */
class Account{
	long accountNumber=1001;
	int balance=5000;
}
class SavingsAccount extends Account{
	
	void deposite() {
		int amt=2000;
		balance+=amt;
		System.out.println("After deposititng saving account balance is:"+balance);
	}
	void withdraw() {
		int amt=1000;
		balance-=amt;
		System.out.println("After withdraw saving account balance is:"+balance);
	}
	
	void calculateInterest() {
		double rate=9.8;
		System.out.println("rate of intreset is:"+rate);
	}
}
class CurrentAccount extends Account{
	void deposite() {
		int amt=1000;
		balance+=amt;
		System.out.println("After deposititng current account balance is:"+balance);
	}
	void withdraw() {
		int amt=500;
		balance-=amt;
		System.out.println("After withdraw current account balance is:"+balance);
	}
	
}
public class Test3{

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount();
		
		sa.deposite();
		sa.withdraw();
		sa.calculateInterest();
		CurrentAccount ca=new CurrentAccount();
		
		ca.deposite();
		ca.withdraw();
		

	}



	}


