package sept8;

import java.util.Scanner;

/*if block executes only true condition*
 */

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int no=sc.nextInt();
		if (no%2==0) {
			System.out.println("Even no");
		}

	}

}
