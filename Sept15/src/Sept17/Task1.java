package Sept17;

public class Task1 {

	public static void main(String[] args) {
		String s1="Sam Dao";
		String s2=new String("Hello World");
		System.out.println(s1+""+s2);
		System.out.println("String size:"+s2.length());
		System.out.println("uppercase:"+s2.toUpperCase());
		System.out.println("Lowercase:"+s2.toLowerCase());
		String i="Hi";
		String j="Hello";
		System.out.println(i+j);
		System.out.println(s1.join(s2));
	}

}
