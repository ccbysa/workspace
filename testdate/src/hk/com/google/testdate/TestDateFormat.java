package hk.com.google.testdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.tree.ExpandVetoException;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss-S aaa");
		Date d = new Date(354757456);
		String str = df.format(d);//将时间对象按照df格式，转化成字符串
		System.out.println(str);
		
		System.out.println("***********************");
		
		String str2 = "1977, 02, 17 15:17:19";
		DateFormat df2 = new SimpleDateFormat("yyyy, MM, dd HH:mm:ss");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
