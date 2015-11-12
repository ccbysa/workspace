package liang03;

import java.util.Scanner;

public class Demo3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数（例如：100）：");
		
		int a = input.nextInt();
		if (a%5 == 0) {
			System.out.println("Hi, five.");
		}
		if (a%2 == 0) {
			System.out.println("Hi, two.");
		}
		
		input.close();
	}
}
