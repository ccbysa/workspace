package liang02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner aScanner = new Scanner(System.in);
		System.out.print("请输入您的名字：");
		String name = aScanner.next();
		System.out.print("请输入您每周工作时间：");
		double timeOfWeek = aScanner.nextDouble();
		System.out.print("请输入您的每小时工资：");
		double payOfHour= aScanner.nextDouble();
		System.out.print("请输入联邦所得税率：");
		double fedTaxRate= aScanner.nextDouble();
		System.out.print("请输入联邦所得税率：");
		double stateTaxRate= aScanner.nextDouble();
		
		System.out.println("Employee's name: " + name);
		System.out.println("Hours worked: " + timeOfWeek);
		System.out.println("Pay rate: " + payOfHour);
		double grossPay = timeOfWeek*payOfHour;
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Fed tax: " + (int)(grossPay*fedTaxRate*100)/100.0);
		System.out.println("  State tax: " + (int)(grossPay*stateTaxRate*100)/100.0);
		System.out.println("  Total deductions: "+(int)(100*grossPay*(fedTaxRate+stateTaxRate))/100.0 );
		System.out.println("Net pay: "+(int)(100*grossPay*(1-fedTaxRate-stateTaxRate))/100.0);
		aScanner.close();
	}
}
