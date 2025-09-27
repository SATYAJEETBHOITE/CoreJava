package com.sept4;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name:");
		String uname=sc.next();
		System.out.println("Enter User address:");
		String address=sc.next();
		
		System.out.println("Enter User contact number:");
		long cno=sc.nextLong();
		
		System.out.println("user Name:"+uname+"\nUser Address:"+address+"\nUser contact number:"+cno);
		
	}

}
