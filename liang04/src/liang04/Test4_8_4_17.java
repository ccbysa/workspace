package liang04;

import java.util.Scanner;

public class Test4_8_4_17 {
	public static void main(String[] args) {
		System.out.print("Please input the number of lines: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for (int i = 0; i < number+1; i++) {
			for (int j = 0; j < number-i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < (2*i-1); j++) {
				
				System.out.printf("%3d", i-j);
				
				if ((i-j) == 1) {
					for (int j2 = 0; j2 < i-1; j2++) {
						System.out.printf("%3d", j2+2);
					}
					break;
				}
				
			}
			System.out.println();
		}
		
		input.close();
	}
}
