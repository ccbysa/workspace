package base10_2;

public class Demo {
	public static void main(String[] args) {
		Corn c = new Corn();
		c.eat();
		c.happyFood();
	}
}

abstract class Food {
	public abstract void eat();
	public void happyFood() {
		System.out.println("Good! Eat me.");
	} 
}

class Corn extends Food {
	public void eat() {
		System.out.println("Corn's eat function.");
	} 
}