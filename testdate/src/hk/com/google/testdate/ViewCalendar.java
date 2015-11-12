package hk.com.google.testdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ViewCalendar {
	public static void main(String[] args) {
		ViewCalendar myCal = new ViewCalendar();
		Date d2 = new Date();
		System.out.println("请输入日期（格式：yyyy-mm-dd，如：2013-1-5）");
		Scanner ssScanner = new Scanner(System.in);
		String str = ssScanner.nextLine();
		
		System.out.println("\n*************************"
						+ "*************************\n");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d2 = df.parse(str);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(d2);
				
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH) + 1;//月份
		int day = calendar.get(calendar.DATE);//日15138796517
		calendar.set(calendar.DATE, 1);
		int wk = calendar.get(calendar.DAY_OF_WEEK) - 1;//星期几？
		
		//wk = (7 - (day -1)%7 + wk -1)%7;
		//int daysOfMonth = myCal.daynumber(year, month);//这个月有几天？
		int daysOfMonth = calendar.getActualMaximum(calendar.DATE);
		//System.out.println(year + "\t"+ month + "\t" + day + "\t" + daysOfMonth + "\t" + wk);
		
		myCal.init();
		int today = 1;
		for (int i = 0; i < wk+daysOfMonth; i++) {
			if (i < wk) {
				System.out.print("\t");
			}else {
				System.out.print(today);
				if (today == day) {
					System.out.print("*");
				}
				System.out.print("\t");
				today++;
			}
			if ((wk+today)%7 == 1) {
				System.out.println();
			}
		}	
		
		
		
		
	}
	
	public void init(){
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
	}
	
	public int daynumber(int year, int MM){
		if (MM == 1| MM == 3| MM == 5|MM == 7| MM == 8| MM ==10|MM == 12) {
			return 31;
		}
		if (MM == 2) {
			if (runnian(year)) {
				return 29;
			}
			return 28;

		}
		return 30;
	}
	
	public  boolean runnian(int year) {
		if (year % 4 == 0 & (year % 400 != 0))  {
			return true;
			}
		return false;
	}
}
