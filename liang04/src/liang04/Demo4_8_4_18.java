package liang04;

import java.util.Scanner;

public class Demo4_8_4_18 {
	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = input.nextInt();
		
		/**
		 * solution for a
		 */
		/*
		for (int i = 1; i < number+1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d ", j);
			}
			System.out.println();
		}
		*/
		
		/**
		 * solution for b
		 */
		/*
		for (int i = number; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
		*/
		
		/**
		 * solution for c
		 */
		/*
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < (number-i); j++) {
				System.out.print("   ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%3d", j);
			}
			System.out.println();			
		}
		*/
		
		/**
		 * solution for d
		 */
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j <= (number-i); j++) {
				System.out.printf("%3d", j+1);
			}
			System.out.println();
		}
		
		
		input.close();
	}
}
