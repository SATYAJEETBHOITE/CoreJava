package Sept19;


	/*same method name different parameter
	 * static binding
	 * compile time  
	 * 
	 */
	class Calculator{
		void add(int a, int b) {
			System.out.println("Sum is:"+(a+b));
			
		}
		void add(int a, int b,int c) {
			System.out.println("Sum is:"+(a+b+c));
		}
		void add(int a,String b) {
			System.out.println("Sum is:"+(a+b));
			
		}
		
		void add(String a,String b) {
			System.out.println("Sum is:"+(a+b));
		}
	}
	public class Demo7 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(5,2);
		c.add(10, "john");
		c.add(10,30,50);
		c.add("Hello","World");

	}

}
