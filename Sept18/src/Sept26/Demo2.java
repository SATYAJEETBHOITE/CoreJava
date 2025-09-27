package Sept26;


import java.util.Scanner;

public class Demo2 {
	public static void show() throws PositiveException, NegativeException {
		Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter no:");
				int no=sc.nextInt();
				if(no>0) {
					throw new PositiveException("Entered number is positive");
					
				}
				else if(no<0) {
					throw new NegativeException("Entered number is negative");
				}
				else {
					System.out.println("Entered number is zero");
				}
				
			}

	public static void main(String[] args) {
		try {
			show();
		} catch (PositiveException e) {
			
			e.printStackTrace();
		} catch (NegativeException e) {
			
			e.printStackTrace();
		}
		

	}

}
