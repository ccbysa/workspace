package liang04;

import java.util.Scanner;

public class Test42_47_4_2 {
	public static void main(String[] args) {
		final int TESTCOUNTER = 10;
		Scanner input = new Scanner(System.in);
		String output = "";
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < TESTCOUNTER; i++) {
			int a = (int)(Math.random()*100)%15+1;
			int b = (int)(System.currentTimeMillis()%15)+1;
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.printf("%d + %d = ?  ", a, b);
			int number = input.nextInt();
			if (number == (a+b)) {
				System.out.println("correct.");
				output += a+" + "+b+" = "+number+"\t correct.\n";
			}
			else {
				System.out.println("wrong.");
				output += a+" + "+b+" = "+number+"\t wrong.\n";
			}
			
		}
		long endTime = System.currentTimeMillis();
		int seconds = (int)(endTime-startTime)/1000;
		int milliSeconds = (int)(endTime-startTime)%1000;
		System.out.println(output);
		System.out.println("last time: "+seconds+" seconds "+milliSeconds+" milliseconds.");
		
		input.close();
	}
}
