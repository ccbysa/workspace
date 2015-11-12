package chapter3_1;

public class Demo {
	String name;
	int age;
	
	public Demo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Demo() {
		// TODO Auto-generated constructor stub
		this("明明", 3);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.name);
		System.out.println(d.age);
	}
}
