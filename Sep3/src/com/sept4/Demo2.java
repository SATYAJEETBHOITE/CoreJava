package com.sept4;

public class Demo2 {
	String studName="Rahul";//instance variable
	static int studage=15;
	void disp() {
		//local variable
		int no1=10, no2=5;
		System.out.println("Addition:"+(no1+no2));
	}

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println("Name of student:"+d.studName);
		System.out.println("Age:"+Demo2.studage);
		d.disp();
		
	}

}
