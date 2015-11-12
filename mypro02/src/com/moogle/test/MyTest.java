package com.moogle.test;
/**
 * 
 * @author willard
 * @version 1.0
 * 
 */
public class MyTest {
	public static void main(String[] args) {
		int b = test01(5);
		System.out.println(b);
	}
/**
 * 	
 * @param a
 * @return
 */
	public static int test01(int a) {
		if (a == 1) {
			return 1;
		}
		return a * test01(a-1);
	}
}
