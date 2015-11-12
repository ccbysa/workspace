package liang04;

import java.util.Scanner;

public class Test42_47_4_1_2 {
	public static void main(String[] args) {
		int sum = 0;
		int positiveNumber = 0;
		int negativeNumber = 0;
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.print("Please input a number(0 for exit.): ");
			number = input.nextInt();
			if (number > 0) {
				positiveNumber++;
			}
			else if (number < 0) {
				negativeNumber++;
			} 
			sum += number;
			
		} while (number != 0);
		
		System.out.println("positive number: "+positiveNumber);
		System.out.println("negative number: "+negativeNumber);
		System.out.println("sum = "+sum);
		if ((positiveNumber+negativeNumber)==0) {
			System.out.println("average = 0");
		}
		else {
			System.out.println("average = "+1.0*sum/(positiveNumber+negativeNumber));
		}
		
		input.close();
	}
}