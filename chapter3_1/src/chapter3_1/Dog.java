package chapter3_1;


public class Dog {
	private String name;
	private int age;
	
	Dog(String name1, int age1) {
		// TODO Auto-generated constructor stub
		name = name1;
		age = age1;
		System.out.println("感谢主人领养了我");
	}
	void bark() {
		System.out.println("汪...汪...汪...");
	}
	void hungry() {
		System.out.println("主人：我饿了.");
	}
	
	public String getName() {
		return this.name;		
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("花花", 12);
		System.out.println(dog.name);
		Dog mydog;
		mydog = new Dog("明明", 23);
		mydog.hungry();
		System.out.println(mydog.age);
	}
}
