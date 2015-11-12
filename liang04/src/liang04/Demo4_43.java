package liang04;

import java.util.Scanner;

public class Demo4_43 {
	public static void main(String[] args) {
		int timeSpan = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = input.nextInt();
		
		long startTime = System.currentTimeMillis();
		for (int i = number; i >= 0; ) {
			long endTime = System.currentTimeMillis();
			int newTimeSpan = (int)(endTime-startTime)/1000;
			if (newTimeSpan != timeSpan) {
				//System.err.println("old: "+startTime);
				//System.out.println("new: "+endTime);
				
				System.out.printf("%2d seconds remaining.\n", i);
				if (i == 0) {
					System.out.println("stopped.");
					break;	
				}
				i--;
			}
			
			timeSpan = newTimeSpan;
			
		}
		
		input.close();
	}
	
}
