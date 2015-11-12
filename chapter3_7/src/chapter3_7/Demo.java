package chapter3_7;

public class Demo {
	public static void main(String[] args) {
		int a = 500;
		Integer b = a;
		int c = b;
		
		Integer obj1 = 500;
		System.out.println("obj equals obj1?  " + b.equals(obj1));
	}	
}
