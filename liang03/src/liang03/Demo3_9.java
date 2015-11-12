package liang03;

import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

public class Demo3_9 {
	public static void main(String[] args) {
		int lottery = (int)(Math.random()*100);
		int lotteryOne = lottery/10;
		int lotteryTwo = lottery%10;
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个两位数：");
		int inputNum = input.nextInt();
		int digitOne = inputNum/10;
		int digitTwo = inputNum%10;
		System.out.println("中奖号码是： "+lottery);
		
		if (inputNum == lottery) {
			System.out.println("恭喜你，中奖 10000元");
		}
		else if (lotteryOne==digitTwo && lotteryTwo==digitOne) {
			System.out.println("恭喜你，中奖 3000元");
		}
		else if ((lotteryOne==digitOne ^ lotteryTwo==digitTwo)||(lotteryOne==digitTwo ^ lotteryTwo==digitOne)) {
			System.out.println("恭喜你，中奖 1000元");
		}
		else {
			System.out.println("很抱歉，没有中奖");
		}
		
		input.close();
	}
}
