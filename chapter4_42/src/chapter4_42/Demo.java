package chapter4_42;

public class Demo {
	public static void main(String[] args) {
		Master ms = new Master();
		ms.feed(new Animal(), new Food());
		ms.feed(new Cat(), new Fish());
		ms.feed(new Dog(), new Bone());
	}
}

class Animal {
	public void eat(Food f) {
		System.out.println("我是一只动物，我正在吃"+f.getFood());
	} 
}

class Cat extends Animal {
	public void eat(Food f) {
		System.out.println("我是一只猫， 我正在吃"+f.getFood());
	} 
}

class Dog extends Animal {
	public void eat(Food f) {
		System.out.println("我是一只狗，我正在吃"+f.getFood());
	}
}

class Food {
	public String getFood() {
		return  "食物";
	} 
}

class Fish extends Food {
	public String getFood() {
		return "鱼";
	} 
}

class Bone extends Food {
	public String getFood() {
		return "骨头";
	}
}

class Master {
	public void feed(Animal an, Food fd) {
		an.eat(fd);
	}
}