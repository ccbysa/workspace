package chapter3_6;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Demo {
	private String name;
	private int age;
	
	public Demo() {
		name = "xiao hua";
		age = 5;
	}
	
	public void print() {
		System.out.printf("My name is %s, I am %d years old.\n", name,  age);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.name = "xiao ming";
		d.age = 3;
		d.print();
		Demo d1 = new Demo();
		d1.print();
	}
}
