package com.hcl;

public class Test1 {

	public static void main(String[] args) {
		
		A a=new A();
		
		System.out.println(a.address+" "+a.name);
		a.setAge(20);
		System.out.println(a.getAge());

	}

}
