package liang04;

import java.util.Scanner;

public class Test4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input your loan amount: ");
		double amount = input.nextDouble();
		System.out.print("Please input your loan years: ");
		int year = input.nextInt();
		int startRate = 5000;
		int step = 125;
		int endRate = 8000;
		/*
		double startRate = 0.05;
		double step = 0.125;
		double endRate = 0.08;
		*/
		
		System.out.println("Interest Rate\t\tMonthly payment\t\tTotal payment");
		for (int i = startRate; i <= endRate; i+=step) {
			System.out.printf("%d.%03d", i/1000, i%1000);
			
			System.out.print("%\t\t\t");
			
			double monthRate = i/1000.0/100.0/12;
			double monthPay = amount*monthRate/(1-1/Math.pow(1+monthRate, year*12));
			double totalPay = monthPay*year*12;
			System.out.print((int)(monthPay*100)/100.0);
			System.out.print("\t\t\t");
			System.out.print((int)(totalPay*100)/100.0);
			System.out.println();
		}
		
		
		
		
		input.close();
	}
}
