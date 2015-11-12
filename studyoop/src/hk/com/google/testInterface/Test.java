package hk.com.google.testInterface;

public class Test {
	public static void main(String[] args) {
		MyClass a = new MyClass();
		a.test01();
		int b = a.test02(3, 6);
		System.out.println(b);
		a.attack();
		MultiClass mcClass = new MultiClass();
		mcClass.attack();
		mcClass.CC();
	}
}
