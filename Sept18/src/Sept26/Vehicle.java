package Sept26;

abstract class Task {

	
		String make;
		String model;
		int year;
		 
		abstract void drive();
		void startEngine() {
			System.out.println("Engine is starting......");
		}

	}
	class Car extends Task{

		@Override
		void drive() {
			make ="Electrical";
			model="Tesla";
			year=2025;
			System.out.println("car is made by:"+make+"\nCar model is:"+model+"\nYear:"+year);
			
		}
		
	}
	class cycle extends Task{

		@Override
		void drive() {
			make ="Electrical";
			model="Hero";
			year=2024;
			System.out.println("Cycle is made by:"+make+"\nCycle model is:"+model+"\nYear:"+year);
			
		}
		
	}
	public class Vehicle {
		public static void main (String [] args) {
			Car c=new Car();
			c.startEngine();
			c.drive();
			cycle c2=new cycle();
			c2.drive();
			c2.startEngine();
			
		}
	}
	
