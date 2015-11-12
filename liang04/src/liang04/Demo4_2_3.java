package liang04;

import java.util.Scanner;
import java.util.logging.Logger;

public class Demo4_2_3 {
	public static void main(String[] args) {
		final int TestTime = 5;
		int count = 0;
		int randomA = 0;
		int randomB = 0;
		int inputNum = 0;
		String output = "\n";
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		
		while (count < TestTime) {
			randomA = (int)(System.currentTimeMillis()%10);
			randomB = (int)(Math.random()*10);
			if (randomA < randomB) {
				int temp = randomA;
				randomA = randomB;
				randomB = temp;
			}
			System.out.printf("请输入%2d - %d 的值： ", randomA, randomB);
			inputNum = input.nextInt();
			if (randomA-randomB == inputNum) {
				System.out.println("Your answer is correct.");
				output += randomA + " - " + randomB + " = " + inputNum + "  correct.\n";
			}
			else {
				System.out.printf("Your answer is wrong.\n%d - %d should be %d.\n", randomA, randomB, (randomA-randomB));
				output += randomA + " - " + randomB + " = " + inputNum + "  wrong.\n";
			}
			
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		int milliSecond = (int)(endTime - startTime)%1000;
		int second = (int)(endTime-startTime)/1000%60;
		int minute = (int)(endTime-startTime)/1000/60;
		System.out.println(output);
		System.out.printf("You have used %2d minute(s) %2d second(s) %3d millisecond(s).", minute, second, milliSecond);
		input.close();
	}
}
