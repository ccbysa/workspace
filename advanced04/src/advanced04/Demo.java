package advanced04;

import java.util.zip.CRC32;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		Human aPerson = new Human();
		Class c1 = aPerson.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getPackage());
		
		Human anotherWoman = new Woman();
		Class c = anotherWoman.getClass();
		System.out.println(c.getName());
		
		Woman aWoman = new Woman();
		Class c2 = aWoman.getClass();
		System.out.println(c2.getName());
		
		//Class c3 = Class.forName("Human");
		Class c3 = Class.forName("advanced04.Human");//类的决定路径
	    System.out.println(c1.getName());
		
		Class c4 = Woman.class;
		System.out.println(c4.getName());
		
		
	}
}

class Human {
	private int height;
	
	public int getHeight() {
		return this.height;
	} 
	
	public void growHeight(int h) {
		this.height += h;
	}
}

class Woman extends Human {
	public Human giveBirth() {
		System.out.println("Give birth.");
		return (new Human());
	} 
}
