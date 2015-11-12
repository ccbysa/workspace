package com.google.testThis;
/**
 * ≤‚ ‘this
 * @author willard
 * @version 1.0
 */
public class Student {
	String name;
	int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	public Student(){
		this("jim", 20);
		System.out.println("name = " + this.name);
		System.out.println("id = " + this.id);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student aStudent = new Student();
		Student bStudent = new Student("HanYu", 30);
		System.out.println(bStudent.name);
		System.out.println(bStudent.id);
		bStudent.setName("Lilei");
		System.out.println(bStudent.name);
	}
}
