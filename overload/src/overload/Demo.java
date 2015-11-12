package overload;

import javax.print.attribute.TextSyntax;
import javax.swing.table.TableStringConverter;

public class Demo {
	public void test() {
		System.out.println("This is no parameters.");
	}
	
	public void test(int a) {
		System.out.printf("%d is a Binary number.\n", a);
	}
	
	public void test(int a, int b) {
		System.out.printf("The sum of %d and %d is %d.\n", a, b, a+b);
	}
	
	public void test(String a) {
		System.out.println(a);
	}
	
	public void test(float a) {
		System.out.printf("%f is a float number.\n", a);
	}
	
	public void test(double a) {
		System.out.println("This is double number.\n");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();
		d.test(5);
		d.test(2, 3);
		d.test("Hello.");
		d.test(3.14f);
		d.test(3.14156d);
	}
}
