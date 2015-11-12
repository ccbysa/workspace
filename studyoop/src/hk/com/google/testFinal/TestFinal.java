package hk.com.google.testFinal;

/**
 * 测试Final变量
 * @author willard
 * @version 1.0
 */
public class TestFinal {
	public static void main(String[] args) {
		final  int MAX_VALUE = 200;
		//MAX_VALUE = 300;
		//The final local variable MAX_VALUE cannot be assigned. 
		//It must be blank and not using a compound assignment
		double d = Math.PI;
		
	}
	
}

//final class Animal{//final 修饰的类，不能被继承
class Animal{
	String color;
	double d = Math.PI;
	
	//public final void run(){ //该方法不能被重写 override
	public void run(){
		System.out.println("Animal.run()");
		System.out.println("动物");
	}
	
}

class Bird extends Animal{
	public void run(){
		super.run();
		System.out.println("Bird.run()");
		System.out.println("鸟在飞");
	}
		
}