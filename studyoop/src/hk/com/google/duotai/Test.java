package hk.com.google.duotai;

public class Test {
	
}

class Animal{
	public void Voice(){
		System.out.println("Animal.enclosing_method()");
		System.out.println("���Զ���Ľ���");
	}
}
class Cat extends Animal{
	public void Voice() {
		System.out.println("Cat.Voice()");
		System.out.println("����");
		
	}
	public void catMouse(){
		System.out.println("Cat.catMouse()");
		System.out.println("ץ����");
	}
}

class Dog extends Animal{
	public void Voice() {
		System.out.println("Dog.Voice()");
		System.out.println("����");
	}
}
class Pig extends Animal{
	public void Voice() {
		System.out.println("Pig.Voice()");
		System.out.println("�ߺ�");
	}
}
