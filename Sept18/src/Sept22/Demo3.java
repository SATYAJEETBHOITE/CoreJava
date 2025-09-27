package Sept22;
abstract class Employee{
	String ename="shani";
	
	abstract void disp() ;
	
	void details() {
		System.out.println("Employee class");
	}
}
abstract class Calci extends Employee{
	abstract void add(int a,int b);
	abstract void sub(int a,int b);
	abstract void mul(int a,int b);
	abstract void div(int a,int b);
}
class Info extends Calci {

	@Override
	void add(int a, int b) {
 System.out.println("Adition:"+(a+b));		
	}

	@Override
	void sub(int a, int b) {
		 System.out.println("Substraction:"+(a-b));		
		
	}

	@Override
	void mul(int a, int b) {
		 System.out.println("Multiplication:"+(a*b));		
		
	}

	@Override
	void div(int a, int b) {
		 System.out.println("Division:"+(a/b));		
		
	}

	@Override
	void disp() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class Demo3 {

	public static void main(String[] args) {
		Info e1=new Info();
		e1.details();
		e1.disp();
		e1.add(10, 5);
		e1.sub(5, 3);
		e1.mul(3, 4);
		e1.div(10,2);
		
	}

}
