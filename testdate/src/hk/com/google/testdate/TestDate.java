package hk.com.google.testdate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * 测试date类
 * @author willard
 *
 */ 
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 1000; j++) {
				for (int j2 = 0; j2 < 1000; j2++) {
					for (int k = 0; k < 1000; k++) {
						for (int k2 = 0; k2 < 1000; k2++) {
							
						}
					}
				}
			}
			long t = System.currentTimeMillis();
			System.out.println(t);
		}
		
		Date d2 = new Date(2000);
		System.out.println(d2);//Thu Jan 01 08:00:02 CST 1970;地方时
		System.out.println(d2.toGMTString());//格林尼治标准时间；
								//不建议使用的方法，用一用也无妨
		
	}
}
