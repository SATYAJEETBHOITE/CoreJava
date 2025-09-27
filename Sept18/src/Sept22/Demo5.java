package Sept22;
class Student {
	String name ;
	int age ;
	Student(){
		System.out.println("Default constructor");
	}
	Student (String name,int age){
		System.out.println("Name:"+name+"\nAge:"+age);
	}
	
	}


public class Demo5 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
	}

}
