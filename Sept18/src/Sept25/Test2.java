package Sept25;

public class Test2 {

	public static void main(String[] args) {
		try {
			try {
			int a[]=new int[5];
			a[6]=100;
			System.out.println(a[6]);
			}catch(ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
			}
			try {
			String name=null;
			System.out.println(name.length());
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			try {
			int i=100/0;
			System.out.println(i);
			
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
