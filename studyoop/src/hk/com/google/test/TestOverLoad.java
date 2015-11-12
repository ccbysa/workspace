package hk.com.google.test;
/**
 * ≤‚ ‘÷ÿ‘ÿ overload
 * @author willard
 * @version 1.2
 */
public class TestOverLoad {
	public int add(int a, int b){
		return a+b;
	}	
	
	public static void main(String[] args) {
		MyMath n = new MyMath();
		System.out.println(n.add(1, 2, 3));
		MyMath i = new MyMath();
		System.out.println(i.add(1, 23, 3, 5));
		TestOverLoad t = new TestOverLoad();
		System.out.println(t.add(3, 5));
		MyMath jMath = new MyMath(5, 7);
		System.out.println(jMath.a);
		System.out.println(jMath.b);
		
	}
}

class MyMath{
	int a;
	int b;
	
	public MyMath() {
		// TODO Auto-generated constructor stub
	}
	public MyMath(int a){
		this.a = a;
	}
	public MyMath(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int add(int a , int b){
		System.out.println("MyMath.add(int)");
		return a+b;
	}
	
	public double add(int a, double b){
		System.out.println("MyMath.add()");
		return a + b;
	}
	
	public String add(String a, String b){
		System.out.println("MyMath.add(string)");
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}
	public int add(int a, int b, int c, int d){
		return a+b+c+d;
	}
}