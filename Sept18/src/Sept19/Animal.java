package Sept19;

public class Animal {
	void play() {
		System.out.println("Animal are playing");
	}
	}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating");
	}
	void details(String color,String sound ) {
		System.out.println("Cat color is :"+color+"\nCat sound:"+sound);
	}
}
class dog extends Cat{
	void dance() {
		System.out.println("Dog is dancing");
	}

public class  Demo2{
	

	public static void main(String[] args) {
		dog d=new dog();
		d.play();
		d.details("brown","Meow Meow");
		d.eat();
		
		

	
	}
}
}


