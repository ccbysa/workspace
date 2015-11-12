import java.util.Scanner;

/**
 * 测试sanner类的使用，
 * @author willard
 * @version 1.0
 */


public class TestScanner {
	public static int test01(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		return a;		
	}
	public static void main(String[] args) {
		System.out.println("请输入加数：");
		int a = test01();
		System.out.println("请输入被加数：");
		int b = test01();
		
		System.out.println("刚才程序输入的和是："+(a+b));
		
	}
}
