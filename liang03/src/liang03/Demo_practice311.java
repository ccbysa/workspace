package liang03;

import java.util.Scanner;

public class Demo_practice311 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年月：");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = 30;
		boolean isLeepYear = false;
		if ((year%4==0 && year%100 != 0)||(year%400 == 0)) {
			isLeepYear = true;
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if (isLeepYear) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;

		default:
			break;
		}
		System.out.println(year+" 年 "+month+" 月 有 "+day+" 天");
		input.close();
	}
}
