package hk.com.google.testdate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, 2013);//没有设置的数值取当前值，如MM, dd, HH, mm ss等等
		
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.MONTH));
		c.setTime(new Date());
		System.out.println(c);
		System.out.println(c.getTime());
		c.add(Calendar.YEAR, -30);
		System.out.println(c.getTime());
	}
}
