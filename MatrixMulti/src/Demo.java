import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a[][] = new int[2][3];//矩阵a，动态
		//int b[][] = new int[3][4];//矩阵b，静态
		int a[][] = { {2, 3, -1}, {6, 1, -2} };
		int b[][] = { {4, -5}, {-3, 0}, {1, 2} };
		int c[][] = new int[2][2];//矩阵c，结果
		//int b[][] = {{1, 5, 2, 8}, {5, 9, 10, -3}, {2, 7, -5, 18}};
		int sum = 0;
		/*
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("请输入a[%d][%d]的值：", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		*/
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for (int j2 = 0; j2 < a[0].length; j2++) {
					//System.out.printf("a[%d][%d]*b[%d][%d] = %d\n", i, j2, j2, j, a[i][j2]*b[j2][j]);
					c[i][j] += a[i][j2]*b[j2][j];
				}
				//System.out.printf("c[%d][%d] = %d.\n", i, j, c[i][j]);
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("c[%d][%d] = %d.\n", i, j, c[i][j]);
			}
		}
	}
}
