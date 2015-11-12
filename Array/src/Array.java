import java.util.*;

public class Array {
	public static void main(String[] args) {
		int a[];
		int[] b;
		
		a = new int[5];
		b = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("请输入a[%d]的值： ", i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d.\n", i, a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("请输入b[%d]的值： ", i);
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %d.\n", i, b[i]);
		}
		
		sc.close();
	}
}
