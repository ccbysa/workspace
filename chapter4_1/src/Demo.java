
public class Demo {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Lilei";
		t.age = 29;
		t.height = 175;
		t.subject = "Chinese";
		t.school = "middle school";
		
		t.say();
		t.lecturing();
	}
}

class People {
	String name;
	int age;
	int height;
	
	public void say() {
		System.out.println("My name is " + name+", I am "+age+" years old, my height is "+height);
	} 
	
}

class Teacher extends People {
	String school;
	String subject;
	int seniority;
	
	public void say() {
		System.out.println("My name is "+name+"I am teaching "+subject);
	}
	
    void lecturing(){
        System.out.println("我已经" + age + "岁了，依然站在讲台上讲课");
    }
}
