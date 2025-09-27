package Sept26;

public class Demo4 {

	public static void main(String[] args) {
		try {
			int a=100/0;
			System.out.println(a);
		}
		finally {
			String name="Sam";
			int age=20;
			System.out.println("Name:"+name+"\nAge:"+age);
		}

	}

}
