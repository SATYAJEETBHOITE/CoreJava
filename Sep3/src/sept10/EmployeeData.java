package sept10;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int E_id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String E_name=sc.next();
		System.out.println("Salary:");
		int Sal=sc.nextInt();
		
		
		
		if (Sal<=300000) {
			System.out.println("A Grade");
		}else if (Sal<=1000000) {
			System.out.println("B Grade");
		}else if (Sal<=1500000) {
			System.out.println("c Grade");
		}else if (Sal<=2000000) {
			System.out.println("D Grade");
		
		} else if(Sal>=5000000) {
			System.out.println("Wrong choice!!!!!");
			
		}
	}

}
