package com.google.testHebit;

public class TestHebit {
	public static void main(String[] args) {
		/*System.out.println(); 
		System.out.println("TestHebit.main()");
		Animal aanAnimal = new Animal();
		aanAnimal.run();
		Mamel aMamel = new Mamel();
		aMamel.eat();
		aMamel.paXing();*/
		Bird aBird = new Bird();
		aBird.eat();
		aBird.run();
		aBird.egg();
		
	}
}

class Animal{
	String color;
	
	public Animal () {
		System.out.println("Animal.Animal()");
		System.out.println("base class");
		System.out.println("����1ֻ����");
	}
	public void run(){
		System.out.println("Animal.run()");
		System.out.println("��ѽ��");
	}
	public void eat() {
		System.out.println("�Գ�");
	}
}

class Mamel extends Animal{
	public void paXing(){
		System.out.println("Mamel.paXing()");
		System.out.println("���ж���");
	}
}

class Bird extends Animal{
	public Bird(){
		System.out.println("Bird.Bird()");
		System.out.println("����1ֻ��");
	}
	public void run(){
		super.run();
		System.out.println("Bird.run()");
		System.out.println("��ѽ��");
	}
	public void egg() {
		System.out.println("Bird.egg()");
		System.out.println("���ද��");
	}
}

