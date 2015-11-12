package liang04;

import java.util.Scanner;

public class Test48_4_16 {
	public static void main(String[] args) {
		System.out.print("Please input a integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean isPrime = true;
		
		do {
			for (int i = 2; i <= number/2; i++) {
				if (number%i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.print(1+", ");
				break;
			}
			int i = 2;
			while (i < number) {
				if (number%i == 0) {
					System.out.print(i+", ");
					number /= i;
					i = 2;
				}
				else {
					i++;
				}
				
			}
			
		} while (isPrime);
		System.out.println(number);
		
		input.close();
	}
}
