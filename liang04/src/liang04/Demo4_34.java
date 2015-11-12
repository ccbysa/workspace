package liang04;

import java.util.Scanner;

public class Demo4_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int win = 0;
		long startTime = System.currentTimeMillis();
		do {
			int a = (int)(System.currentTimeMillis()%3+1);
			int b = 0;
			do {
				System.out.println("Please input your choose(1-stone; 2-scissors; 3-cloth):");
				b = input.nextInt();
			} while ((b-0)>3);
			System.out.println("computer: "+a);
			
			//计算机出 石头
			if (a == 1) {
				if (b == 2) {
					win++;
					System.out.println("You lost.");
				}
				else if (b == 3) {
					win--;
					System.out.println("You win.");
				}
				else {
					System.out.println("drew");
				}
			}
			//计算机出 剪刀
			if (a == 2) {
				if (b == 1) {
					win--;
					System.out.println("You win.");
				}
				else if (b == 3) {
					win++;
					System.out.println("You lost.");
				}
				else {
					System.out.println("drew");
				}
			}
			//计算机出 布
			if (a == 3) {
				if (b == 1) {
					win++;
					System.out.println("You lost.");
				}
				else if (b == 2) {
					win--;
					System.out.println("You win.");
				}
				else {
					System.out.println("drew");
				}
			}
			
		} while (Math.abs(win)<2);
		
		long endTime = System.currentTimeMillis();
		int seconds = (int)(endTime-startTime)/1000;
		int milliSeconds = (int)(endTime-startTime)%1000;
		System.out.printf("The soft last %d seconds %d milliseconds.\n",seconds, milliSeconds);
		
		input.close();
	}
}
