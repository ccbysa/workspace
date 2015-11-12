package liang03;

import java.util.Scanner;

public class Demo_practice321 {
	public static void main(String[] args) {
		String dayOfWeek = "";
		System.out.print("请输入年 月 日：");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		if (month==1 || month==2) {
			year -= 1;
			month += 12;
		}
		int j = year/100;
		int k = year%100;
		
		int h = (day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
		switch (h) {
		case 0:
			dayOfWeek = "Saturday";
			break;
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		
		}
		
		System.out.println("Day of week is: "+dayOfWeek);
		input.close();
	}
}
