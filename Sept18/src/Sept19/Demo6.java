package Sept19;


	/*
	 overriding 
	 method name same and also parameter same 
	 Dynamic binding 
	 Runtime polymorphism
	 
	 */
     class Bus {
		String cb="BST";
		void speed (String color,int speed ) {
			System.out.println("Bus color is:"+color+"\nBus Speed is:"+speed);
		}
	}
	class Car extends Bus {
		void speed (String color,int speed ) {
			System.out.println("Car color is:"+color+"\nCar Speed is:"+speed);
		}
	}
	class ByCycle extends Bus {
		void speed (String color,int speed) {
			super.speed("white",180);
			System.out.println("ByCyle color is: "+color+"\nByCycle speed is:"+speed);
			System.out.println(super.cb);
		}
	}
	public class Demo6 {
		
	


		public static void main(String[] args) {
		Bus b1,b2;
		b1=new Car();
		b2=new ByCycle();
		b1.speed("Black",120);
		b2.speed("Red",10);
		
	}
	}
	


