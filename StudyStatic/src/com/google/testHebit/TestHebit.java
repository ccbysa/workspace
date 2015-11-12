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
		System.out.println("创建1只动物");
	}
	public void run(){
		System.out.println("Animal.run()");
		System.out.println("跑呀跑");
	}
	public void eat() {
		System.out.println("吃吃");
	}
}

class Mamel extends Animal{
	public void paXing(){
		System.out.println("Mamel.paXing()");
		System.out.println("爬行动物");
	}
}

class Bird extends Animal{
	public Bird(){
		System.out.println("Bird.Bird()");
		System.out.println("创建1只鸟");
	}
	public void run(){
		super.run();
		System.out.println("Bird.run()");
		System.out.println("飞呀飞");
	}
	public void egg() {
		System.out.println("Bird.egg()");
		System.out.println("鸟类动物");
	}
}

