package sept9;

public class Variabletypes {
	String message="Hello";
	static String name="john smith";
	void disp() {
		int age=15;//local variable
		System.out.println("Age is :"+age);
	}

	public static void main(String[] args) {
		//classname objectname=new classname();
		
		Variabletypes v=new Variabletypes();
		System.out.println(v.message);//instance variable
		System.out.println(Variabletypes.name);//static variable
		v.disp();
			
		}
		
	}


