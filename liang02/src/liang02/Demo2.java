package liang02;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.printf("请输入您所在的时区（例如：GMT+8，输入8）：");
		Scanner input = new Scanner(System.in);
		int local = input.nextInt();
		input.close();
		long milliseconds = System.currentTimeMillis();
		long seconds = milliseconds/1000;
		int secondOfDay = (int)(seconds%(24*3600));
		int hh = secondOfDay/3600;
		int localHour = secondOfDay/3600+local;
		int mm = secondOfDay%3600/60;
		int ss = secondOfDay%60;
		System.out.printf("hh:mm:ss   %02d:%02d:%02d\n", hh, mm, ss);
		System.out.printf("hh:mm:ss   %02d:%02d:%02d", localHour, mm, ss);
		//input.close();
	}
}
