package hk.com.google.abstractClass;

public class TestAbstract {
	public static void main(String[] args) {
		Animal aaAnimal = new Cat();
		
	}
	
}

abstract class Animal{
	private int a;
	
	public abstract void run();
	public void breath(){
		System.out.println("Animal.enclosing_method()");
		System.out.println("呼吸");
	}
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal.Animal()");
		System.out.println("创建一个动物");
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat.run()");
		System.out.println("猫步");
	}
}

class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog.run()");
		System.out.println("狗跑");
	}
	
}