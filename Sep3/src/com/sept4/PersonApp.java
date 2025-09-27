package com.sept4;

public class PersonApp {
	
	//user defined function
	void show(String name,int age) {
		System.out.println("Name:"+name+"\nAge:"+age);
	}

	public static void main(String[] args) {
		//classname objectname=new classname();
		PersonApp p=new PersonApp();
		p.show("Sam" ,40);
		p.show("john" ,45);
		p.show("Ram" ,35);
		
		
	}

}
