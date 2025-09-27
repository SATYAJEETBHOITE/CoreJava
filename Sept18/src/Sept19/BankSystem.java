package Sept19;

class Customer {
	String name="satyajeet";
	String address="Mumbai";
	long contactNumber=8946739848L;
	int balance=5000;
}
class Accounts extends Customer{
	void info() {
		System.out.println("Customer Name:"+name+"\nCustomer Address:"+address+"\nContact number"+contactNumber+"\nBalance"+balance);
	}
	void deposite(int amt) {
		balance+=amt;
		System.out.println("After depositing balance is :"+balance);
	}
	void withdraw(int amt) {
		balance-=amt;
		System.out.println("After withdrawing balance is :"+balance);
	}
}
public class BankSystem{
	
	public static void main(String[] args) {
		 Accounts a=new Accounts();
			a.info();
			a.deposite(5000);
			a.withdraw(1000);
	}

}
