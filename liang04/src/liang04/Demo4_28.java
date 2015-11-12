package liang04;

import java.util.Scanner;

public class Demo4_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input year: ");
		int year = input.nextInt();
		System.out.print("Please input week(0 for sunday.): ");
		int week = input.nextInt();
		String monthString = "";
		
		for (int i = 1; i <= 12; i++) {
			int dayOfMonth = 0;
			int realDays = 0;
			switch (i-1) {
			case 0://实际是1月，1月1日的星期以输入
				dayOfMonth = 0;
				realDays = 31;
				monthString = "January";
				break;
			case 1://实际是2月，计算2月1日的星期用1月的天数
				dayOfMonth = 31;
				monthString = "February";
				realDays = 28;
				if ((year%4==0 && year%100 != 0)||(year%400==0)) {
					realDays += 1;
				}
				break;
			case 3://实际是4月，计算4月1日的星期用3月的天数
				dayOfMonth = 31;
				realDays = 30;
				monthString = "April";
				break;
			case 5://实际是6月，计算6月1日的星期用5月的天数
				dayOfMonth = 31;
				realDays = 30;
				monthString = "June";
				break;
			case 7://实际是8月，计算8月1日的星期用7月的天数
				dayOfMonth = 31;
				realDays = 31;
				monthString = "August";
				break;
			case 8://实际是9月，计算9月1日的星期用8月的天数
				dayOfMonth = 31;
				realDays = 30;
				monthString = "September";
				break;
			case 10://实际是11月，计算11月1日的星期用10月的天数
				dayOfMonth = 31;
				realDays = 30;
				monthString = "November";
				break;
			case 12:
				dayOfMonth = 31;
				break;
			case 4://实际是5月，计算5月1日的星期用4月的天数
				dayOfMonth = 30;
				realDays = 31;
				monthString = "May";
				break;
			case 6://实际是7月，计算7月1日的星期用6月的天数
				dayOfMonth = 30;
				realDays = 31;
				monthString = "July";
				break;
			case 9://实际是10月，计算10月1日的星期用9月的天数
				dayOfMonth = 30;
				realDays = 31;
				monthString = "October";
				break;
			case 11://实际是12月，计算12月1日的星期用11月的天数
				dayOfMonth = 30;
				realDays = 31;
				monthString = "December";
				break;
			case 2://实际是3月，计算3月1日的星期用2月的天数
				monthString = "March";
				dayOfMonth = 28;
				realDays = 31;
				if ((year%4==0 && year%100 != 0)||(year%400==0)) {
					dayOfMonth += 1;
				}
				break;
			}
			//System.out.printf("%4d-%s\t-%02d: ", year, monthString, 1);
			System.out.println("                   "
						+monthString+", "+year);
			System.out.println("-------------------------"
						+"-------------------------------");
			System.out.println("Sun\tMon\tTue\tWeb\tThu\tFri\tSat\t");
			
			int newWeek = (week+dayOfMonth)%7;
			//System.out.println(newWeek);
			int count = 0;
			for (int j2 = 0; j2 < newWeek; j2++) {
				System.out.print("\t");
				count++;
			}
			for (int j = 1; j <= realDays; j++) {
				System.out.print(j+"\t");
				count++;
				if (count%7==0) {
					System.out.println();
				}
				
			}
			System.out.println();
			
			week = newWeek;
		}
		
		input.close();
	}
}
