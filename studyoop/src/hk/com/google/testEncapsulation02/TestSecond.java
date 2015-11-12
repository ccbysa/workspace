package hk.com.google.testEncapsulation02;
/**
 * 测试封装，这个第二个包
 * @author willard
 * @version 1.0
 */
public class TestSecond {
	private int a = 5;
	int b = 6;
	protected int c = 7;
	public int d = 8;
	private boolean big;
	
	
	
	
	public boolean isBig() {
		return big;
	}
	public void setBig(boolean big) {
		this.big = big;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	private void Print1(int x) {
		a = x; b =x; c = x; d = x;//同一个类中都是可见的
		System.out.println("我是第二个包的第一个文件");
		System.out.println("我的属性是private");
	}
	void Print2(int x){
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Pring2()");
		System.out.println("我的属性是默认的，default");
	}
	protected void Print3(int x)	{
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Print3()");
		System.out.println("我的属性是protected");
	}
	public void Print4(int x) {
		a = x; b =x; c = x; d = x;
		System.out.println("TestSecond.Print4()");
		System.out.println("我的属性是public");
	}
}
 
//public class Test2 {//每个文件只能有一个public 类
class Test2{
	TestSecond t = new TestSecond();
	int b;
	
	public void setA(){
		//t.a = 5;//不同的类中不可见
		t.b = 6;
		t.c = 7;
		t.d = 8;
		
	}
}
