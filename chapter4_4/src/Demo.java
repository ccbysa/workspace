
public class Demo {
	public static void main(String[] args) {
		Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		
		a.cry();
		c.cry();
		d.cry();
		
		a = new Dog();
		a.cry();
		a = new Cat();
		a.cry();
		
		a = d;
		a.cry();
		a = c;
		a.cry();
	}
	
}

class Animal {
	public void cry() {
		System.out.println("不知道怎么叫");
		
	} 
}

class Cat extends Animal {
	public void cry() {
		System.out.println("喵喵");
	} 
}

class Dog extends Animal {
	public void cry() {
		System.out.println("汪汪");
	}
}