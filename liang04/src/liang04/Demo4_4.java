package liang04;

import java.util.Scanner;

public class Demo4_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber = 0;
		int sum = 0;
		String output = "\n";
		
		 do {
			output += inputNumber + " + ";
			sum += inputNumber;
			System.out.println("Sum = "+sum);
			System.out.print("Please input a integer: ");
			inputNumber = input.nextInt();
			
		} while (inputNumber != 0);
		System.out.println("Sum = "+sum);
		System.out.println(output+"\b\b = "+sum);
		
		input.close();
		
	}
}
