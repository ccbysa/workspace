package liang04;

import java.util.Scanner;

public class Test4_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your loan amount: ");
		double amount = input.nextDouble();
		System.out.print("Please input your loan year: ");
		int year = input.nextInt();
		System.out.print("Please input your loan year's rate: ");
		double rate = input.nextDouble();
		double monthRate = rate/100/12;
		double monthPay = amount*monthRate/(1-1/Math.pow(1+monthRate, year*12));
		double remainsAmount = amount;
		
		System.out.println();
		System.out.println("Payment#\tInterest\tPrinciple\tBalance");
		for (int i = 1; i <= year*12; i++) {
			double interest = monthRate*remainsAmount;
			double principal = monthPay-interest;
			remainsAmount -= principal;
			System.out.printf("%2d\t\t%5.2f\t\t%5.2f\t\t%7.2f\n", i, interest, principal, remainsAmount);
		}
		
		
		input.close();
	}
}
