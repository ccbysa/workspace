package liang04;

import java.util.Scanner;

public class Demo4_46_2 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("please input a number: ");
		int number = name.nextInt();
		int mask = 1;
		
		for (int i = 15; i >= 0; i--) {
			//System.out.println("i = "+i);
			//System.out.println(number>>i);
			System.out.print((number>>i)&mask);
			//System.out.println("");
			
		}
		
		name.close();
	}
	static void printInfo(int number) {
		System.out.println(Integer.toBinaryString(number));
	}
}
