package liang04;

import java.util.Scanner;

public class Demo4_46 {
	public static void main(String[] args) {
		final int BASE = 2;
		final int LENGTH = 16;
		String output = "";
		Scanner name = new Scanner(System.in);
		System.out.print("Please input a integer: ");
		int number = name.nextInt();
		int len = 0;
		
		while (number/BASE != 0) {
			output = (number%BASE)+output;
			len++;
			number /= BASE;
		}
		output = (number%BASE)+output;
		len++;
		for (; len < LENGTH; len++) {
			output = "0"+output;	
		}
		
		System.out.println(output);
		name.close();
	}
}
