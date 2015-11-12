package hk.com.google.testInterface;

public class MyClass implements MyInterface, Attack{//用接口实现了类似多继承

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("MyClass.test01()");
		System.out.println();
	}

	@Override
	public int test02(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("MyClass.test02()");
		System.err.println("a+b = " + (a+b));
		return a+b;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("MyClass.attack()");
		System.out.println("攻击人");
	}

}
class MultiClass implements MultiFace{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("MultiClass.test01()");
	}

	@Override
	public int test02(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("MultiClass.test02()");
		return 0;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("MultiClass.attack()");
	}

	@Override
	public void CC() {
		// TODO Auto-generated method stub
		System.out.println("MultiClass.CC()");
	}
	
}