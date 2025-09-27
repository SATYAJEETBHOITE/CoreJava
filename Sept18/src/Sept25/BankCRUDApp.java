package Sept25;
import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accountNumber +
                           ", Name: " + holderName +
                           ", Balance: " + balance);
    }
}

public class BankCRUDApp {
	private static BankAccount[] accounts = new BankAccount[100]; // fixed size array
    private static int count = 0; // number of accounts
    private static Scanner sc = new Scanner(System.in);
    
    //CREATE
    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        accounts[count++] = new BankAccount(accNo, name, bal);
        System.out.println("Account created successfully!");
    }
//READ-View All
    private static void viewAccounts() {
        if (count == 0) {
            System.out.println(" No accounts available!");
            return;
        }
        System.out.println("------ Account List ------");
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
    }
   // READ- Search by account no
    private static void searchAccount() {
        System.out.print("Enter Account Number to search: ");
        int accNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                accounts[i].display();
                return;
            }
        }
        System.out.println(" Account not found!");
    }
    // UPDATE
    private static void updateAccount() {
        System.out.print("Enter Account Number to update: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                System.out.print("Enter New Holder Name: ");
                String newName = sc.nextLine();
                System.out.print("Enter New Balance: ");
                double newBal = sc.nextDouble();

                accounts[i].holderName = newName;
                accounts[i].balance = newBal;

                System.out.println(" Account updated successfully!");
                return;
            }
        }
        System.out.println(" Account not found!");
    } // DELETE
    private static void deleteAccount() {
        System.out.print("Enter Account Number to delete: ");
        int accNo = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                // Shift left to delete
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[count - 1] = null; // remove last duplicate
                count--;
                System.out.println("Account deleted successfully!");
                return;
            }
        }
        System.out.println(" Account not found!");
    }

     //MAIN MENU
	public static void main(String[] args) {
		 int choice;
	        do {
	            System.out.println("\n===== Bank Account Management =====");
	            System.out.println("1. Create Account");
	            System.out.println("2. View All Accounts");
	            System.out.println("3. Search Account");
	            System.out.println("4. Update Account");
	            System.out.println("5. Delete Account");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: createAccount(); break;
	                case 2: viewAccounts(); break;
	                case 3: searchAccount(); break;
	                case 4: updateAccount(); break;
	                case 5: deleteAccount(); break;
	                case 6: System.out.println(" Exiting..."); break;
	                default: System.out.println(" Invalid choice!");
	            }
	        } while (choice != 6);
		
	}

}
