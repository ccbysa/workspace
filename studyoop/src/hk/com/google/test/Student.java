package hk.com.google.test;

public class Student {
	public String name;
	public int weight;
	public int id;
	public String gender;
	public Computer computer;
	
	public void study(){
		System.out.println(name + "在学习");
		
	}
	
	public void sayhello(String a) {
		System.out.println(name + "对" + a + "说：你好");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "James";
		s1.study();
		s1.sayhello("LiuMing");
		Computer aComputer = new Computer();
		aComputer.brand = "lenovo";
		s1.computer = aComputer;
		System.out.println(s1.weight);
		System.out.println(s1.id);
		System.out.println(s1.gender);
		System.out.println(s1.computer.brand);
	}
}