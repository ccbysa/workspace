package liang04;

import java.util.Scanner;

public class Demo4_8_4_19 {
	public static void main(String[] args) {
		System.out.print("Please input the number of lines: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for (int i = 1; i < (number+1); i++) {
			for (int j = 1; j <= (number-i); j++) {
				System.out.print("    ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%4d", (int)(Math.pow(2, j)));
			}
			for (int j = 0; j < (i-1); j++) {
				System.out.printf("%4d", (int)(Math.pow(2, (number-j-2))));
			}
			
			System.out.println();
		}
		
		input.close();
	}
}
