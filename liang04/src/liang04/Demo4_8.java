package liang04;

import java.util.Scanner;

public class Demo4_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入2个整数，以求最大公约数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int submultiple = 1;
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = 1; i < (b+1); i++) {
			if ((a%i == 0) && (b%i == 0)) {
				submultiple = i;
			}
		}
		System.out.printf("%d 和 %d的最大公约数是： %d.", a, b, submultiple);
		
		input.close();
	}
}
