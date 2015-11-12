package liang04;

import java.util.Scanner;

public class Test48_4_15 {
	public static void main(String[] args) {
		System.out.print("Please input two integers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int d = (a > b)? b : a;
		int i = 1;
		
		for (i = d; i > 1; i--) {
			if ((a%i == 0)&&(b%i == 0)) {
				System.out.println("The greast common divisor is :"+i);
				break;
			}
		}
		if (i==1) {
			System.out.println("The greast common divisor is :"+i);
		}
		
		input.close();
	}
}
