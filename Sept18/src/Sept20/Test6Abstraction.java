package Sept20;
abstract class Tutorial{
	static int tId=101;
	abstract void disp();
	void show() {
		System.out.println("show method");
	}
}
abstract class post extends Tutorial{
	abstract void print (String postName);
}
class Details extends post{
	@Override
	void disp() {
		System.out.println("Disp method");
		System.out.println("Tutorial Id:"+tId);
		
		
	}
	@Override
	void print(String postName) {
		System.out.println("post Name:"+postName);
	}
}
public class Test6Abstraction {
	

	public static void main(String[] args) {
		//Tutorial t=new Tutorial();
		Details d=new Details();
		d.disp();
		d.print("Java is Secure");
		
	}

}
