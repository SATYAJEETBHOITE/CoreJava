package com.eb;

import com.hcl.A;

public class Task extends A {

	public static void main(String[] args) {


		A a=new A();
		
		System.out.println(a.name);
		a.setAge(50);
		System.out.println(a.getAge());
		
		Task t=new Task();
		
		System.out.println(t.address);

	}

}
