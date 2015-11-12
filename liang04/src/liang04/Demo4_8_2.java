package liang04;

import java.util.Scanner;

public class Demo4_8_2 {
	public static void main(String[] args) {
		double base = 7000;
		double newfee = base;
		System.out.print("请输入年数（例如：5）:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		for (int i = 0; i < year; i++) {
			newfee *= (1+0.07); 
			i++;
		}
		System.out.printf("%d 年以后的学费是： %f.\n", year, newfee);
		
		base = newfee = 10000;
		int i = 1;
		while (newfee/base < 2) {
			newfee *= (1+0.07);
			System.out.printf("%d 年后的比例: %f\n", i, newfee/base);
			i++;
		}
		System.out.printf("%d 年后学费翻倍。newfee = %f.", --i, newfee);
		
		input.close();
	}
}
