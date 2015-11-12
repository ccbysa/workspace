package liang04;

import java.util.Scanner;

public class Demo4_37 {
	public static void main(String[] args) {
		final int BASE = 2;
		System.out.print("Please input a integer: ");
		Scanner name = new Scanner(System.in);
		int number = name.nextInt();
		String output = "";
		char covert = 55;
		
		while (number/BASE != 0) {
			if (number%BASE>9) {
				output = (char)(covert+number%BASE)+output;
			}
			else {
				output = number%BASE+output;
			}
			number = number/BASE;
		}
		if (number>9) {
			output = (char)(covert+number)+output;
		}
		else output = number+output;
		System.out.println(output);
		name.close();
	}
}
