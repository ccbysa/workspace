package chapter3_1;

public class Test_this {
	int x = 5;
	int y = 4;
		
	public void sum() {
		System.out.println(this.x+this.y);			
	}
	
	public static void main(String[] args) {
		Test_this a = new Test_this();
		a.sum();
	}
}
