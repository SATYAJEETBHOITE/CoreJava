package Sept19;

class A{
	void print () {
		System.out.println("Class A");
	}
}
class B extends A{
	void show() {
		System.out.println("Class B");
	}
}
class C extends B{
	void disp(){
		System.out.println("Class C");
		
	}
}
class D extends B{
	void info() {
		System.out.println("Class D");
	}
	

	}

public class Demo4 {

	public static void main(String[] args) {
		C c1=new C();
		D d1=new D();
		c1.disp();
		d1.info();
		d1.print();
		d1.show();
		
		
		

	}

}
