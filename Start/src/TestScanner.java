import java.util.Scanner;

/**
 * ����sanner���ʹ�ã�
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
		System.out.println("�����������");
		int a = test01();
		System.out.println("�����뱻������");
		int b = test01();
		
		System.out.println("�ղų�������ĺ��ǣ�"+(a+b));
		
	}
}
