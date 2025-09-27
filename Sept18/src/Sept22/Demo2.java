package Sept22;
interface Animal{
	void sound();
	static void eat() {
		System.out.println("Eating...");
	}
}
class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Bow Bow...");
		
	}
	
}
class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Meow Meow");
		
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.sound ();
		Animal.eat();
		Dog d=new Dog();
		d.sound();
		
		

	}

}
