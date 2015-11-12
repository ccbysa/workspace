package com.google.static00;

public class Student {
	private static int a;
	public int b;
	
	public Student(){
		a++;
	}
	public static void printa(){
		System.out.println("Student.printa()");
		System.out.println(a);
	}
	public void printb(){
		a++;
		printa();
		System.out.println("Student.printb()");
		System.out.println(b);
	}
}
