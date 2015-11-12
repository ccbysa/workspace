package hk.com.google.duotai;

public class Test {
	
}

class Animal{
	public void Voice(){
		System.out.println("Animal.enclosing_method()");
		System.out.println("²âÊÔ¶¯ÎïµÄ½ĞÉù");
	}
}
class Cat extends Animal{
	public void Voice() {
		System.out.println("Cat.Voice()");
		System.out.println("ß÷ß÷");
		
	}
	public void catMouse(){
		System.out.println("Cat.catMouse()");
		System.out.println("×¥ÀÏÊó");
	}
}

class Dog extends Animal{
	public void Voice() {
		System.out.println("Dog.Voice()");
		System.out.println("ÍôÍô");
	}
}
class Pig extends Animal{
	public void Voice() {
		System.out.println("Pig.Voice()");
		System.out.println("ºßºß");
	}
}
