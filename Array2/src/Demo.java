import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		int b[][] = new int[2][3];
		int [][]c = new int[2][];
		
		c[0] = new int[3];
		c[1] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d] = %d.\n", i, j, a[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("请输入b[%d][%d]的值：", i, j);
				b[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}
}
